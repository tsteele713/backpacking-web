package com.poorvins.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.poorvins.daos.ParksDao;
import com.poorvins.models.Park;

@Service
@Qualifier(ParksService.QUALIFIER)
public class ParksServiceImpl implements ParksService {
	
	@Autowired(required = true)
	@Qualifier(ParksDao.QUALIFIER)
	private ParksDao parksDao;

	@Override
	public List<Park> getAllParks() {
		return parksDao.getAllParks();
	}

	@Override
	public List<Park> getAllParksForState(String state) {
		// TODO Auto-generated method stub
		return parksDao.getAllParksForState(state);
	}

	@Override
	public List<Park> getAllParksForType(String type, String state) {
		// TODO Auto-generated method stub
		return parksDao.getAllParksForType(type, state);
	}

}
