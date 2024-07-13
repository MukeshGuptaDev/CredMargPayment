package com.CredMargPayment.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmailLog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String vendorEmail;
	private String content;
	private LocalDateTime timeStamp;
	public void setVendorEmail(String vendorEmail) {
		this.vendorEmail = vendorEmail;
	}
	public Long getId() {
		return id;
	}
	public String getVendorEmail() {
		return vendorEmail;
	}
	public String getContent() {
		return content;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
