package com.icfassignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.icfassignment.dto.EmployeeDTO;
import com.icfassignment.employeeException.EmployeeDetailsException;
import com.icfassignment.service.EmployeeService;

@Controller(value="employeeController")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	public String getAllEmployeeDetails() throws EmployeeDetailsException {
//		EmployeeService empService = new EmployeeServiceImpl();
		List<EmployeeDTO> list = empService.findAll();
		
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		return new String("Details Fetched Successfully");
	}
	
	
	public String getEmployeeBasedOnId(Integer id) throws EmployeeDetailsException {
		EmployeeDTO emp = empService.getEmployee(id);
		System.out.println(emp);
		return new String("Employee(Based on ID) Details Fetched Successfully");
	}
	
	public String getEmployeeBasedOnEmpId(String empId) throws EmployeeDetailsException {
		EmployeeDTO emp = empService.findByEmpId(empId);
		System.out.println(emp);
		return new String("Employee(Based on Employee ID) Details Fetched Successfully");
	}
	
}
