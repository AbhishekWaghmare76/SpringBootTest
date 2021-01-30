package com.abhishek.test1.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.test1.emailer.iEmailerService;

@RestController
public class EmailServiceController {
//	iEmailerService emailService = new DummyEmailSender();
	
	//Dont creaet any obj with specific type let spring create it 
	//@Autowired      //at instance variable
	iEmailerService emailService;
	
	public iEmailerService getEmailService() {
		return emailService;
	}

	/*
	@Autowired
	public void setEmailService(iEmailerService emailService) {
		this.emailService = emailService;
	}
	*/

	
	@Autowired //using constructor
	public EmailServiceController(iEmailerService abc) {
		this.emailService = abc;
	}
	
	
	@RequestMapping("/sendMail")
	public String email() throws MessagingException {
		emailService.sendEmail("AdiBhosale@adi.com", "Trying to send", "Ghe Mail");
		
		return "Mail Sent";
	}
}
