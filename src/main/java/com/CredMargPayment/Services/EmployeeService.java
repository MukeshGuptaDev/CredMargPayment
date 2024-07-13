package com.CredMargPayment.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.CredMargPayment.Model.Employee;
import com.CredMargPayment.Repositories.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	public Employee save(Employee employee) {
		try {
			return employeeRepository.save(employee);
		} catch (DataIntegrityViolationException e) {
			throw new IllegalArgumentException("Email already exist for another employee. ");
		}
	}
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
}
