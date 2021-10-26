package com.poorvins.services;

public interface EmailSendingService {

	public static final String QUALIFIER = "emailSendingService";

	public void generateForgottenPasswordEmail(String emailAddress, String encryptedId);
	
}
