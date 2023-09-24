package com.mosa.SpringBootEmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;


import jakarta.mail.MessagingException;
@SpringBootApplication
public class SpringBootEmailApplication {
@Autowired
private EmailSenderService senderService;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {
		senderService.sendEmail("d00256490@dmail.dixie.edu",
				"This is email subject",
				"This is email body");

	}

}