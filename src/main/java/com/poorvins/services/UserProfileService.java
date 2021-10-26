package com.poorvins.services;

import com.poorvins.models.ForgotPassword;
import com.poorvins.models.UserProfile;

public interface UserProfileService {
	public static final String QUALIFIER = "userProfileService";

	public UserProfile getProfileForEmailAddress(String emailAddress);

	public void createProfile(UserProfile userProfile);

	public void sendResetPasswordEmail(String emailAddress);

	public ForgotPassword getForgottenRecordForEmailAddress(String emailAddress);

	public void resetPassword(ForgotPassword passwordInfo);
	
}
