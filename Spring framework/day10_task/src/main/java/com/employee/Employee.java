package com.employee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component
@PropertySource("classpath:com/employee/employee.properties")
public class Employee
{
 private int employeeId;
 private String employeeName;
 private String department;
 private double salary;
 
 public Employee()
 {}

 public int getEmployeeId() {
	return employeeId;
 }

 @Value("${id}")
 public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
 }

 public String getEmployeeName() {
	return employeeName;
 }

 @Value("${name}")
 public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
 }

 public String getDepartment() {
	return department;
 }

 @Value("${department}")
 public void setDepartment(String department) {
	this.department = department;
 }

 public double getSalary() 
 {
	return salary;
 }

 @Value("${salary}")
 public void setSalary(double salary) {
	this.salary = salary;
 }

 @Override
 public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", department=" + department
			+ ", salary=" + salary + "]";
 }
 	
}
