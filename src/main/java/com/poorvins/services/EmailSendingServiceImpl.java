package com.poorvins.services;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier(EmailSendingService.QUALIFIER)
public class EmailSendingServiceImpl implements EmailSendingService {
	
	@Override
	public void generateForgottenPasswordEmail(String emailAddress, String encryptedId) {
		Properties properties;
//		Session session;
		MimeMessage mimeMessage;

//		String USERNAME = "steele.tyler13@gmail.com";
//		String PASSWORD = "Buckley13";
//		boolean AUTH = true;
//		String emailSubject = "Subject:HTML Subject Body Test";
//		String emailBody = "<b>Text Message Body: Hello World</b>";
//		String toAddress = "steele.tyler13@gmail.com";
		
		try {
			String to = "steele.tyler13@gmail.com";
		    String subject = "Backpacking Forgot Password";
		    String msg ="<p>It looks as though someone is attempting to reset your password. "
		    		+ "If this was not you, please ignore this email. Otherwise, "
		    		+ "<a href=\"http://localhost:4200/completePasswordReset\">Click here to continue.</a></p>";
		    final String from ="steele.tyler13@gmail.com";
		    final  String password ="Buckley13";


		    Properties props = new Properties();  
		    props.setProperty("mail.transport.protocol", "smtp");     
		    props.setProperty("mail.host", "smtp.gmail.com");  
		    props.put("mail.smtp.auth", "true");  
		    props.put("mail.smtp.port", "465");  
		    props.put("mail.debug", "true");  
		    props.put("mail.smtp.socketFactory.port", "465");  
		    props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");  
		    props.put("mail.smtp.socketFactory.fallback", "false");  
		    Session session = Session.getDefaultInstance(props,  
		    new javax.mail.Authenticator() {
		       protected PasswordAuthentication getPasswordAuthentication() {  
		       return new PasswordAuthentication(from,password);  
		   }  
		   });  

		   //session.setDebug(true);  
		   Transport transport = session.getTransport();  
		   InternetAddress addressFrom = new InternetAddress(from);  

		   MimeMessage message = new MimeMessage(session);  
		   message.setSender(addressFrom);  
		   message.setSubject(subject);  
		   message.setContent(msg, "text/html; charset=utf-8");  
		   message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));  

		   transport.connect();  
		   Transport.send(message);  
		   transport.close();
		     
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
