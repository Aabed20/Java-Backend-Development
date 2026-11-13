package com.employee.task;

public class Employee
{
   private int employeeId;
   private String employeeName;
   private double salary;
   public Employee(int employeeId, String employeeName, double salary) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.salary = salary;
   }
   public int getEmployeeId() {
	return employeeId;
   }
   public String getEmployeeName() {
	return employeeName;
   }
   public double getSalary() {
	return salary;
   }
   
   public void display()
   {
	   System.out.println("Employee Details :\nEmployee Id : "+this.employeeId);
	   System.out.println("Employee Name : "+this.employeeName);
	   System.out.println("Employee Salary : "+this.salary);
   }
	
	
	
	
	
}
