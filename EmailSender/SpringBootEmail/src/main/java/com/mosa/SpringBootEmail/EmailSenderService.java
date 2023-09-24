package com.mosa.SpringBootEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailSenderService {
	
@Autowired
private JavaMailSender mailSender;

public void sendEmail(String toEmail, String subject, String body) {
SimpleMailMessage message = new SimpleMailMessage();
message.setFrom("d00256490@dmail.dixie.edu");
message.setTo(toEmail);
message.setText(body);
message.setSubject(subject);

mailSender.send(message);

System.out.println("Mail Sent Successfully");
}
}
