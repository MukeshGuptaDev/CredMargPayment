package com.CredMargPayment.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CredMargPayment.Model.EmailLog;

public interface EmailLogRepository extends JpaRepository<EmailLog, Long> {
}
