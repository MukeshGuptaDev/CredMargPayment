package com.CredMargPayment.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.CredMargPayment.Model.Vendor;
import com.CredMargPayment.Repositories.VendorRepository;


@Service
public class VendorService {
	@Autowired
	private VendorRepository vendorRepository;
	
	public Vendor save(Vendor vendor) {
		try {
			return vendorRepository.save(vendor);
		} catch (DataIntegrityViolationException e) {
			throw new IllegalArgumentException("Email already exist for another vendor. ");
		}
	}
	public List<Vendor> findAll(){
		return vendorRepository.findAll();
	}
}
