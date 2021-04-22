package com.icfassignment.EmployeeDetails;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.icfassignment.dto.EmployeeDTO;
import com.icfassignment.employeeException.EmployeeDetailsException;
import com.icfassignment.entity.Employee;
import com.icfassignment.repository.EmployeeRepository;
import com.icfassignment.service.EmployeeService;
import com.icfassignment.service.EmployeeServiceImpl;

@SpringBootTest
public class EmployeeDetailsApplicationTests {
	
	@Mock
	EmployeeRepository employeeRepository;
	
	@InjectMocks
	EmployeeService emploService = new EmployeeServiceImpl();
	
	@Test
	public void checkEmpBasedOnID() throws EmployeeDetailsException{

		Optional<Employee> empOpt = Optional.of(new Employee());
		Employee empdto = empOpt.get();
		empdto.setId(3);
		empdto.setFirstName("XYZ");
		empdto.setLastName("PQR");
		empdto.setEmpId("EMP2");
		empdto.setStartDate(LocalDate.of(2020, 06, 12));
			
		Mockito.when(employeeRepository.findById(Mockito.anyInt())).thenReturn(empOpt);		
		EmployeeDTO emp2 = emploService.getEmployee(Mockito.anyInt());
		Assertions.assertTrue(emp2 != null);
	}
	
	@Test
	public void checkEmptyGetEmployeeDetails() throws EmployeeDetailsException{
		Optional<Employee> empOpt = Optional.of(new Employee());
		Employee empdto = empOpt.get();
		empdto.setId(3);
		empdto.setFirstName("XYZ");
		empdto.setLastName("PQR");
		empdto.setEmpId("EMP2");
		empdto.setStartDate(LocalDate.of(2020, 06, 12));
			
		Mockito.when(employeeRepository.findByEmpId(Mockito.anyString())).thenReturn(empOpt);		
		EmployeeDTO emp2 = emploService.findByEmpId(Mockito.anyString());
		Assertions.assertTrue(emp2 != null);
	} 
	
}
