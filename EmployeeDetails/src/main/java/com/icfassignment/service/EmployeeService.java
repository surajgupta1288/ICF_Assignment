package com.icfassignment.service;

import java.util.List;

import com.icfassignment.dto.EmployeeDTO;
import com.icfassignment.employeeException.EmployeeDetailsException;

public interface EmployeeService {
	public List<EmployeeDTO> findAll() throws EmployeeDetailsException;
	
	public EmployeeDTO getEmployee(Integer id) throws EmployeeDetailsException;
	
	public EmployeeDTO findByEmpId(String empId) throws EmployeeDetailsException;
}
