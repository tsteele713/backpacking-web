package com.poorvins.daos;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.poorvins.models.ForgotPassword;
import com.poorvins.models.UserProfile;

@Component
@Qualifier(UserProfileDao.QUALIFIER)
public class UserProfileDaoImpl implements UserProfileDao {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public UserProfile getProfileForEmailAddress(String emailAddress) {
		SqlSession session = sqlSessionFactory.openSession();
		UserProfile jobStatus = session.selectOne("UserProfile.getProfileForEmailAddress", emailAddress);
		session.close();
		return jobStatus;
	}

	@Override
	public void createProfile(UserProfile userProfile) {
		SqlSession session = sqlSessionFactory.openSession();
		session.insert("UserProfile.createProfile", userProfile);
		session.close();
		
	}

	@Override
	public ForgotPassword createForgotPasswordRecord(String emailAddress) {
		SqlSession session = sqlSessionFactory.openSession();
		session.insert("UserProfile.createForgotPasswordRecord", emailAddress);
		ForgotPassword forgotPasswordRecord = session.selectOne("UserProfile.getForgottenPasswordRecordForEmailAddress", emailAddress);
		session.close();
		return forgotPasswordRecord;
	}

	@Override
	public ForgotPassword getForgottenRecordForEmailAddress(String emailAddress) {
		SqlSession session = sqlSessionFactory.openSession();
		ForgotPassword forgotPasswordRecord = session.selectOne("UserProfile.getForgottenPasswordRecordForEmailAddress", emailAddress);
		session.close();
		return forgotPasswordRecord;
	}

	@Override
	public void resetPassword(ForgotPassword passwordInfo) {
		SqlSession session = sqlSessionFactory.openSession();
		session.update("UserProfile.resetPassword", passwordInfo);
		session.delete("UserProfile.deleteForgotPasswordRecord", passwordInfo);
		
	}

}
