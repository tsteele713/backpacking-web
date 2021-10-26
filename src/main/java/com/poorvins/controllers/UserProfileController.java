package com.poorvins.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.poorvins.constants.Constants;
import com.poorvins.exceptions.InvalidEmailAddressException;
import com.poorvins.exceptions.InvalidSeqIdTokenException;
import com.poorvins.exceptions.UserAccountDoesNotExist;
import com.poorvins.exceptions.UserAlreadyExistsException;
import com.poorvins.exceptions.UserProfilePasswordMismatchException;
import com.poorvins.models.ForgotPassword;
import com.poorvins.models.UserProfile;
import com.poorvins.services.UserProfileService;
import com.poorvins.validators.UserProfileValidator;

@Component
@Qualifier(Constants.Qualifiers.CONTROLLER)
@Path(Constants.Endpoints.USERS_ENDPOINT)
public class UserProfileController {
	
	private static final Logger LOG = LoggerFactory.getLogger(UserProfileController.class);
	
	@Autowired(required = true)
	@Qualifier(UserProfileService.QUALIFIER)
	private UserProfileService userProfileService;

	   @POST 
	   @Path(Constants.Endpoints.CREATE_PROFILE) 
	   @Consumes(MediaType.APPLICATION_JSON)
	   @Produces(MediaType.APPLICATION_JSON)
	   public Response createProfile(UserProfile userProfile) throws Exception {
		   
		   try {
			   validateProfileCreation(userProfile);
			   userProfileService.createProfile(userProfile);
			   return Response.ok().build();
		   } catch (UserProfilePasswordMismatchException | InvalidEmailAddressException | UserAlreadyExistsException e) {
			   Map<String,String> exceptionString = new HashMap<String, String>();
			   exceptionString.put("Status", Response.Status.BAD_REQUEST.name());
			   exceptionString.put("Exception", e.getMessage());
			   return Response.status(Response.Status.BAD_REQUEST).entity(exceptionString).build();
		   }
		   
	   }
	   
	   @POST 
	   @Path(Constants.Endpoints.FORGOT_PASSWORD) 
	   @Consumes(MediaType.APPLICATION_JSON)
	   @Produces(MediaType.APPLICATION_JSON)
	   public Response emailResetPasswordLink(String emailAddress) throws Exception {
		   
		   try {
			   ObjectMapper mapper = new ObjectMapper();
			   Map<String, String> map = mapper.readValue(emailAddress, Map.class);
			   validatePasswordReset(map.get("emailAddress"));
			   
			   userProfileService.sendResetPasswordEmail(map.get("emailAddress"));
			   return Response.ok().build();
		   } catch (InvalidEmailAddressException | UserAccountDoesNotExist e) {
			   Map<String,String> exceptionString = new HashMap<String, String>();
			   exceptionString.put("Status", Response.Status.BAD_REQUEST.name());
			   exceptionString.put("Exception", e.getMessage());
			   return Response.status(Response.Status.BAD_REQUEST).entity(exceptionString).build();
		   }
		   
	   }
	   
	   @POST 
	   @Path(Constants.Endpoints.RESET_PASSWORD) 
	   @Consumes(MediaType.APPLICATION_JSON)
	   @Produces(MediaType.APPLICATION_JSON)
	   public Response resetPassword(ForgotPassword passwordInfo) throws Exception {
		   
		   try {

			   validateReset(passwordInfo);
			   
			   userProfileService.resetPassword(passwordInfo);
			   return Response.ok().build();
		   } catch (UserAccountDoesNotExist | InvalidSeqIdTokenException e) {
			   Map<String,String> exceptionString = new HashMap<String, String>();
			   exceptionString.put("Status", Response.Status.BAD_REQUEST.name());
			   exceptionString.put("Exception", e.getMessage());
			   return Response.status(Response.Status.BAD_REQUEST).entity(exceptionString).build();
		   }
		   
	   }
	   
	   private void validateReset(ForgotPassword passwordInfo) throws UserAccountDoesNotExist, InvalidSeqIdTokenException {
		   UserProfile checkUserProfile = userProfileService.getProfileForEmailAddress(passwordInfo.getEmailAddress());
		   if (checkUserProfile == null) {
			   throw new UserAccountDoesNotExist("No Account associated with this email address");
		   }
		   
		   ForgotPassword userPassword = userProfileService.getForgottenRecordForEmailAddress(passwordInfo.getEmailAddress());
		   BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();  
		   boolean matcher = encoder.matches(userPassword.getSeqId(), passwordInfo.getSeqId());
		   if (!matcher) {
			   throw new InvalidSeqIdTokenException("Invalid encrypted seqId Token");
		   }
		
	}

	public void validatePasswordReset(String emailAddress) throws InvalidEmailAddressException, UserAccountDoesNotExist {
		   UserProfileValidator.validateProperEmailAddress(emailAddress);
		   UserProfile checkUserProfile = userProfileService.getProfileForEmailAddress(emailAddress);
		   if (checkUserProfile == null) {
			   throw new UserAccountDoesNotExist("No Account associated with this email address");
		   }
	   }
	   
	   private void validateProfileCreation(UserProfile userProfile) throws UserProfilePasswordMismatchException, InvalidEmailAddressException, UserAlreadyExistsException {
		   
		   UserProfileValidator.validatPasswordsMatch(userProfile);
		   
		   UserProfileValidator.validateProperEmailAddress(userProfile.getEmailAddress());

		   
		   UserProfile checkUserProfile = userProfileService.getProfileForEmailAddress(userProfile.getEmailAddress());
		   if (checkUserProfile != null) {
			   throw new UserAlreadyExistsException("Account already exists for this Email Address");
		   }
		   
	   }
}
