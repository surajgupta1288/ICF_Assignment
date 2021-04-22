package com.icfassignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.icfassignment.controller.EmployeeController;

@SpringBootApplication
public class EmployeeDetailsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDetailsApplication.class, args);
	}
	
	@Autowired
	EmployeeController empController;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Application Started!!");
		
//		EmployeeController empController = new EmployeeController();
		String str = empController.getAllEmployeeDetails();
		System.out.println(str);
		
		str = empController.getEmployeeBasedOnId(4);
		System.out.println(str);
		
		str = empController.getEmployeeBasedOnEmpId("EMP2");
		System.out.println(str);
	}
	
	

}
