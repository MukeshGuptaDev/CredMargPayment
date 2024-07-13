package com.CredMargPayment.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CredMargPayment.Model.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
