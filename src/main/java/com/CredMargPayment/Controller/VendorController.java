package com.CredMargPayment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.CredMargPayment.Model.Vendor;
import com.CredMargPayment.Services.VendorService;

@RestController
@RequestMapping("/api/vendors")
public class VendorController {
	@Autowired
	private VendorService vendorService;
	
	@PostMapping
	public Vendor create(@RequestBody Vendor vendor) {
		try {
			return vendorService.save(vendor);
		} catch (IllegalArgumentException e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
		}
	}
	
	@GetMapping("/all")
	public List<Vendor> getAll(){
		return vendorService.findAll();
	}
}
