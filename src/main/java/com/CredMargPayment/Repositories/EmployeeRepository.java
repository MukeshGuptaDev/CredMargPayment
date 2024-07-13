package com.CredMargPayment.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.CredMargPayment.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
