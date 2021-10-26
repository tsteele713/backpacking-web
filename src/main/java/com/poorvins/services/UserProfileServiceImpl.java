package com.poorvins.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.poorvins.daos.UserProfileDao;
import com.poorvins.models.ForgotPassword;
import com.poorvins.models.UserProfile;

@Service
@Qualifier(UserProfileService.QUALIFIER)
public class UserProfileServiceImpl implements UserProfileService {
	
	@Autowired(required = true)
	@Qualifier(UserProfileDao.QUALIFIER)
	private UserProfileDao userProfileDao;
	
	@Autowired(required = true)
	@Qualifier(EmailSendingService.QUALIFIER)
	private EmailSendingService emailSendingService;

	@Override
	public UserProfile getProfileForEmailAddress(String emailAddress) {
		return userProfileDao.getProfileForEmailAddress(emailAddress);
	}

	@Override
	public void createProfile(UserProfile userProfile) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encryptedPassword = encoder.encode(userProfile.getPassword());
		userProfile.setPassword(encryptedPassword);
		userProfileDao.createProfile(userProfile);
		
		
	}

	@Override
	public void sendResetPasswordEmail(String emailAddress) {
		ForgotPassword forgotPasswordRecord = userProfileDao.createForgotPasswordRecord(emailAddress);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encryptedId = encoder.encode(forgotPasswordRecord.getSeqId());
		emailSendingService.generateForgottenPasswordEmail(emailAddress, encryptedId);
	}

	@Override
	public ForgotPassword getForgottenRecordForEmailAddress(String emailAddress) {
		return userProfileDao.getForgottenRecordForEmailAddress(emailAddress);
	}

	@Override
	public void resetPassword(ForgotPassword passwordInfo) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encryptedPassword = encoder.encode(passwordInfo.getNewPassword());
		passwordInfo.setNewPassword(encryptedPassword);
		userProfileDao.resetPassword(passwordInfo);
		
	}

}
