package com.poorvins.daos;

import com.poorvins.models.ForgotPassword;
import com.poorvins.models.UserProfile;

public interface UserProfileDao {
	public static final String QUALIFIER = "userProfilesDao";

	public UserProfile getProfileForEmailAddress(String emailAddress);

	public void createProfile(UserProfile userProfile);

	public ForgotPassword createForgotPasswordRecord(String emailAddress);

	public ForgotPassword getForgottenRecordForEmailAddress(String emailAddress);

	public void resetPassword(ForgotPassword passwordInfo);
}
