package com.icfassignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.icfassignment.dto.EmployeeDTO;
import com.icfassignment.employeeException.EmployeeDetailsException;
import com.icfassignment.entity.Employee;
import com.icfassignment.repository.EmployeeRepository;


@Service(value="employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository empRespository;

	@Override
	public List<EmployeeDTO> findAll() throws EmployeeDetailsException{
		Iterable<Employee> employees = empRespository.findAll();
		
		List<EmployeeDTO> employeeDTO = new ArrayList<>();
		employees.forEach(emp -> {
			EmployeeDTO empdto = new EmployeeDTO();
			empdto.setId(emp.getId());
			empdto.setFirstName(emp.getFirstName());
			empdto.setLastName(emp.getLastName());
			empdto.setEmpId(emp.getEmpId());
			empdto.setStartDate(emp.getStartDate());
			empdto.setDesignation(emp.getDesignation());
			empdto.setDepartment(emp.getDepartment());
			empdto.setEndDate(emp.getEndDate());
			empdto.setStatus(emp.getStatus());
			empdto.setDob(emp.getDob());
			empdto.setReportingManager(emp.getReportingManager());
			empdto.setGender(emp.getGender());
			empdto.setBloodGroup(emp.getBloodGroup());
			empdto.setAddress(emp.getAddress());
			employeeDTO.add(empdto);
		});
		
		if(employeeDTO.isEmpty())
			throw new EmployeeDetailsException("Employees Doesn't Exist");
		return employeeDTO;
	}

	@Override
	public EmployeeDTO getEmployee(Integer id) throws EmployeeDetailsException {
		Optional<Employee> empOpt = empRespository.findById(id);
		if(empOpt.isEmpty())
			throw new EmployeeDetailsException("Employee Doesn't Exist");
		Employee emp = empOpt.get();
		EmployeeDTO empdto = new EmployeeDTO();
		empdto.setId(emp.getId());
		empdto.setFirstName(emp.getFirstName());
		empdto.setLastName(emp.getLastName());
		empdto.setEmpId(emp.getEmpId());
		empdto.setStartDate(emp.getStartDate());
		empdto.setDesignation(emp.getDesignation());
		empdto.setDepartment(emp.getDepartment());
		empdto.setEndDate(emp.getEndDate());
		empdto.setStatus(emp.getStatus());
		empdto.setDob(emp.getDob());
		empdto.setReportingManager(emp.getReportingManager());
		empdto.setGender(emp.getGender());
		empdto.setBloodGroup(emp.getBloodGroup());
		empdto.setAddress(emp.getAddress());
		
		return empdto;
	}

	@Override
	public EmployeeDTO findByEmpId(String empId) throws EmployeeDetailsException {
		Optional<Employee> empOpt = empRespository.findByEmpId(empId);
		if(empOpt.isEmpty())
			throw new EmployeeDetailsException("Employee Doesn't Exist");
		Employee emp = empOpt.get();
		EmployeeDTO empdto = new EmployeeDTO();
		empdto.setId(emp.getId());
		empdto.setFirstName(emp.getFirstName());
		empdto.setLastName(emp.getLastName());
		empdto.setEmpId(emp.getEmpId());
		empdto.setStartDate(emp.getStartDate());
		empdto.setDesignation(emp.getDesignation());
		empdto.setDepartment(emp.getDepartment());
		empdto.setEndDate(emp.getEndDate());
		empdto.setStatus(emp.getStatus());
		empdto.setDob(emp.getDob());
		empdto.setReportingManager(emp.getReportingManager());
		empdto.setGender(emp.getGender());
		empdto.setBloodGroup(emp.getBloodGroup());
		empdto.setAddress(emp.getAddress());
		
		return empdto;
	}
	
}
