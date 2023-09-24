package com.mosa.SpringBootEmail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.Assert;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class SpringBootEmailApplicationTests {
	   @Autowired
	    private EmailSenderService senderService;
	   @Test
	    void testEmailSending() {
	        try {
	            String toEmail = "pickletitzz@gmail.com";
	            String subject = "Test Subject";
	            String body = "Test Body";

	            senderService.sendEmail(toEmail, subject, body);

	            // If the email is sent without any exceptions, the test is successful.
	            Assert.isTrue(true, "Email sent successfully");
	        } catch (Exception e) {
	            // If there's an exception, fail the test.
	            Assert.isTrue(false, "Failed to send email: " + e.getMessage());
	        }
	    }
	@Test
	void contextLoads() {
	}

}
