package com.poorvins.validators;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.apache.commons.lang3.StringUtils;

import com.poorvins.exceptions.InvalidEmailAddressException;
import com.poorvins.exceptions.UserProfilePasswordMismatchException;
import com.poorvins.models.UserProfile;


public class UserProfileValidator {
	
	
	public static void validatPasswordsMatch(UserProfile userProfile) throws UserProfilePasswordMismatchException {
		   if (StringUtils.isBlank(userProfile.getPassword()) || 
				   StringUtils.isBlank(userProfile.getConfirmationPassword()) ||
				   !userProfile.getPassword().equals(userProfile.getConfirmationPassword())) {
			   throw new UserProfilePasswordMismatchException("Passwords do not match.");
		   }
	}
	
	public static void validateProperEmailAddress(String emailAddress) throws InvalidEmailAddressException {
		   try {
			      InternetAddress emailAddr = new InternetAddress(emailAddress);
			      emailAddr.validate();
			   } catch (AddressException ex) {
			      throw new InvalidEmailAddressException("Invalid Email Address");
			   }
	}
}
