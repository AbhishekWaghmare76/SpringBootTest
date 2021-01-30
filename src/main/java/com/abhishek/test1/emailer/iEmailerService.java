package com.abhishek.test1.emailer;

import javax.mail.MessagingException;

public interface iEmailerService {
		 public void sendEmail(String emailID,String subject,String mailContent) throws MessagingException;
}
