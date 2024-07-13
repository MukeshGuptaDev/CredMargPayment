package com.CredMargPayment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CredMargPayment.Model.EmailLog;
import com.CredMargPayment.Model.Vendor;
import com.CredMargPayment.Services.EmailService;

@RestController
@RequestMapping("/api/emails")
public class EmailController {
	@Autowired
	private EmailService emailService;

	// http://localhost:8000/api/emails/send
	/*
	 * { "name":"vendor name", "email":"mukesh@gmail.com", "upi":"upi@ybl" }
	 */
	@PostMapping("/send")
	public void sendEmail(@RequestBody Vendor vendor) {
		emailService.sendEmail(vendor);
	}

//	http://localhost:8000/api/emails/all
	/*
	 * [ { "id": 1, "vendorEmail": "mukesh@gmail.com", "content":
	 * "Sending payments to vendorvendor nameupi@ybl", "timeStamp":
	 * "2024-07-11T05:46:32.197698" } ]
	 */
	@GetMapping("/all")
	public List<EmailLog> getAll() {
		return emailService.findAll();
	}
}
