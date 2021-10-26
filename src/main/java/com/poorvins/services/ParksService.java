package com.poorvins.services;

import java.util.List;

import com.poorvins.models.Park;

public interface ParksService {
	
	public static final String QUALIFIER = "parksService";

	public List<Park> getAllParks();

	public List<Park> getAllParksForState(String string);

	public List<Park> getAllParksForType(String type, String state);

}
