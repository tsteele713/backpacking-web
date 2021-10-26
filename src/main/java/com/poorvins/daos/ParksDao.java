package com.poorvins.daos;

import java.util.List;

import com.poorvins.models.Park;

public interface ParksDao {

	public static final String QUALIFIER = "parksDao";

	public List<Park> getAllParks();

	public List<Park> getAllParksForState(String state);

	public List<Park> getAllParksForType(String type, String state);
	
}
