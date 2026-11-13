package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("resources/application.properties")
public class CompanyService 
{
  
	private String name;
	
	private String location;
	
	private int employeesCount;
	
	@Autowired
	private Employee employee;
	
	@Autowired
	public CompanyService(
		@Value("${company.name}")	String name,
		@Value("${company.location}")	String location, 
		@Value("${company.employee-count}")	int employeeCount)
	{
		this.name=name;
		this.location=location;
		this.employeesCount=employeeCount;
	}

	@Override
	public String toString() {
		return "CompanyService [name=" + name + ", location=" + location + ", employeesCount=" + employeesCount
				+ ", employee=" + employee + "]";
	}
	
}
