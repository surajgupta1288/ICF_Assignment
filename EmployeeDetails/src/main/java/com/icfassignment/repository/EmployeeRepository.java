package com.icfassignment.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.icfassignment.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
	public Optional<Employee> findByEmpId(String empID);
}
