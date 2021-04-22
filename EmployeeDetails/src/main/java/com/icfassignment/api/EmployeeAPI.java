package com.icfassignment.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.icfassignment.dto.EmployeeDTO;
import com.icfassignment.employeeException.EmployeeDetailsException;
import com.icfassignment.service.EmployeeService;

@RestController
@RequestMapping(value="/icf")
public class EmployeeAPI {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping(value = "/employees")
	public ResponseEntity<List<EmployeeDTO>> getAllEmployees() throws EmployeeDetailsException{
		List<EmployeeDTO> list = empService.findAll();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@GetMapping(value = "/employees/id/{id}")
	public ResponseEntity<EmployeeDTO> getEmployeeBasedOnId(@PathVariable Integer id) throws EmployeeDetailsException{
		EmployeeDTO emp = empService.getEmployee(id);
		return new ResponseEntity<>(emp,HttpStatus.OK);
	}
	
	@GetMapping(value = "/employees/empId/{empId}")
	public ResponseEntity<EmployeeDTO> getEmployeeBasedOnEmpId(@PathVariable String empId) throws EmployeeDetailsException{
		EmployeeDTO emp = empService.findByEmpId(empId);
		return new ResponseEntity<>(emp,HttpStatus.OK);
	}
	
}
