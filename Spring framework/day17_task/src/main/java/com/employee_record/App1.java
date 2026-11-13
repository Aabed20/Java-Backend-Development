package com.employee_record;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfiguration.class);
		
		EmployeeDao bean = context.getBean(EmployeeDao.class);
		
		Employee emp = bean.getEmployeeById(3);
		
		//System.out.println(emp);
		
		List<Employee> allEmployees = bean.getAllEmployees();
		
		System.out.println(allEmployees);

	}

}
