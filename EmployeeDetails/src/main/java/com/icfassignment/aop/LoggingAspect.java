package com.icfassignment.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.icfassignment.employeeException.EmployeeDetailsException;

@Component
@Aspect
public class LoggingAspect {
	public static final Log LOGGER = LogFactory.getLog(LoggingAspect.class);
	
	@Before("execution(* com.icfassignment.service.*Impl.*(..))")
	public void before() throws EmployeeDetailsException{
		LOGGER.info("Logging... Service Method Called");
	}
	
	@After("execution(* com.icfassignment.service.*Impl.*(..))")
	public void after() throws EmployeeDetailsException{
		LOGGER.info("Logging... Service Method Exceuted Successfully");
	}
	
	@AfterThrowing(pointcut = "execution(* com.icfassignment.service.*Impl.*(..))",throwing="exception")
	public void afterThrowing(EmployeeDetailsException exception) throws EmployeeDetailsException{
		LOGGER.error(exception.getMessage(),exception);
	}
	
}
