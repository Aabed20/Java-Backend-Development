package com.employee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee
{
@Value("#{myprops.id}")
 private int id;
@Value("#{myprops.name}")
 private String name;
 @Value("#{myprops.department}")
 private String department;
 @Value("#{myprops.salary}")
 private double salary;
 @Value("#{myprops.city}")
 private String city;
 
 public Employee() {}

 @Override
 public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + ", city="
			+ city + "]";
 }

}
