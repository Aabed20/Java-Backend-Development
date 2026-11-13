//Assignment 02 :
//---------------
//Create a BLC class Employee class with properties 
//
//String firstName
//String lastName
//int employeeId
//double salary
//int noOfProject
//
//
//Create a setEmployeeData() method with 5 parameters variables to initialize all the instance variables.
//
//Write public void calculateSalary() method that will add extra ammount in salary based on NoOfProject by using following criteria.
//
//NoOfProject is more than 5 and less than 10 then add 5000 to the salary.
//NoOfProject is more than 10 and less than 20 then add 10000 to the salary.
//NoOfProject is more than 20 then add 15000 to the salary.
//
//Take a method called public void displayDetails() to display the employee details with updated salary.
//
//Take an ELC class Tester with main method to test your logic.

package blc;


public class Employee1 {
 
 String firstName;
 String lastName;
 int employeeId;
 double salary;
 int noOfProject;
 double updatedSalary;
 
 public void setEmployeeData(String fName, String lName, int empId, double sal, int projects)
 {
	 firstName = fName;
	 lastName = lName;
	 employeeId = empId;
	 salary = sal;
	 noOfProject = projects;
	 
 }
 
 public void calculateSalary()
 {
	 if(noOfProject>=20)
	 {
		 updatedSalary = salary+15000;
	 }
	 else if(noOfProject>=10&&noOfProject<20)
	 {
		 updatedSalary = salary+10000;
	 }
	 else if(noOfProject>5&&noOfProject<10)
	 {
		 updatedSalary = salary+5000;
	 }
	 else {
		 updatedSalary = salary+0;
	 }
	 
 }
 public void displayDetails()
 {
	 System.out.println("Employee Name is "+firstName+" "+lastName);
	 System.out.println("Employee Id is "+employeeId);
	 System.out.println("Employee done "+noOfProject+" Projects");
	 System.out.println("Employee Salary is "+salary);
	 System.out.println("Updated Salary "+updatedSalary);
 }
	
	
	
}
