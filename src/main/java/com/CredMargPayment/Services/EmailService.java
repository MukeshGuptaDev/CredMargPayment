package com.CredMargPayment.Services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CredMargPayment.Component.EmailClientComponent;
import com.CredMargPayment.Model.EmailLog;
import com.CredMargPayment.Model.Vendor;
import com.CredMargPayment.Repositories.EmailLogRepository;

@Service
public class EmailService {
	@Autowired
	private EmailLogRepository emailLogRepository;

	public void sendEmail(Vendor vendor) {
		String subject = "Payment Notification";
		String content = "Sending payments to vendor" + vendor.getName() + vendor.getUpi();
		EmailClientComponent emailClientComponent = new EmailClientComponent();
		emailClientComponent.sendEmail(vendor.getEmail(),subject,content);
		
		EmailLog emailLog = new EmailLog();
		emailLog.setVendorEmail(vendor.getEmail());
		emailLog.setContent(content);
		emailLog.setTimeStamp(LocalDateTime.now());
		emailLogRepository.save(emailLog);
		System.out.println("Email Sent to: " + vendor.getEmail() + " With content " + content);
	}

	public List<EmailLog> findAll() {
		return emailLogRepository.findAll();
	}
}
