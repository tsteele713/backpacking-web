package com.poorvins.daos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.poorvins.models.Park;

@Component
@Qualifier(ParksDao.QUALIFIER)
public class ParksDaoImpl implements ParksDao {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}


	@Override
	public List<Park> getAllParks() {
		SqlSession session = sqlSessionFactory.openSession();
		List<Park> parks = session.selectList("Parks.getAllParks");
		session.close();
		return parks;
	}


	@Override
	public List<Park> getAllParksForState(String state) {
		SqlSession session = sqlSessionFactory.openSession();
		List<Park> parks = session.selectList("Parks.getAllParksForState", state.toLowerCase());
		session.close();
		return parks;
	}


	@Override
	public List<Park> getAllParksForType(String type, String state) {
		
		Map<String, String> params = new HashMap<String, String>();
		if (state != null) {
			params.put("state", state.toLowerCase());
		}
		if (type != null) {
			params.put("type", type.toLowerCase());
		}
		
		SqlSession session = sqlSessionFactory.openSession();
		List<Park> parks = session.selectList("Parks.getAllParksForType", params);
		session.close();
		return parks;
	}

}
