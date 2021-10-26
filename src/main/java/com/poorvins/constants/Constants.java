package com.poorvins.constants;

public class Constants {

	public static class Endpoints {
		
		public static final String JOB_STATUS_ENDPOINT = "/jobStatus"; 
		public static final String STATUS = "/status";
		public static final String UPDATE_STATUS = "/updateStatus";
		public static final String RETRIEVE_ALL = "/allMigrations";
		
		public static final String USERS_ENDPOINT = "/users"; 
		public static final String CREATE_PROFILE = "/createProfile";
		public static final String FORGOT_PASSWORD = "/forgotPassword";
		public static final String RESET_PASSWORD = "/resetPassword";
		public static final String PARKS_ENDPOINT = "/parks";
		public static final String RETRIEVE_PARKS = "/retrieveParks";
		
	}
	
	public static class Qualifiers {
		public static final String USERS_CONTROLLER = "usersController";
		public static final String PARKS_CONTROLLER = "parksController";
	}
	
}
