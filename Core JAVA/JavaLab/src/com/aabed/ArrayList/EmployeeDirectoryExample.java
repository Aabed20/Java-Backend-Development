package com.aabed.ArrayList;

import java.util.ArrayList;

class Employee
{
	private String name;
	private String position;
	private double salary;
	
	public Employee(String name, String position, double salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public double getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + "]";
	}
}

class Directory
{
	ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
	
	public void addEmployee()
	{
		String name = IO.readln("Enter Employee Name : ");
		String position = IO.readln("Enter Employee Position : ");
		double salary = Double.parseDouble(IO.readln("Enter Employee Salary : "));
		
		listOfEmployees.add(new Employee(name,position,salary));
	}
	
	public void displayAllEmployee()
	{
		IO.println("All Employee Details :\n");
		IO.print(listOfEmployees);
	}
	
	public void updateEmployee()
	{
		String name = IO.readln("Enter Employee Name to update : ");
		boolean employeeFound = false;
		for(int i=0; i<listOfEmployees.size(); i++)
		{
			if(listOfEmployees.get(i).getName().equalsIgnoreCase(name))
			{
				employeeFound = true;
				String position = IO.readln("Enter Employee Position to Update : ");
				double salary = Double.parseDouble(IO.readln("Enter Employee Salary to Update : "));
				listOfEmployees.get(i).setPosition(position);
				listOfEmployees.get(i).setSalary(salary);
				break;
			}
		}
		if(employeeFound)
		{
			IO.println("Employee Information Succesfully Updated.");
		}
		else
		{
			IO.println("Employee with Name "+name+" not Found.");
		}
	}
	
	public void deleteEmployee()
	{
		String name = IO.readln("Enter Employee Name to delete : ");
		boolean employeeFound = false;
		for(int i=0; i<listOfEmployees.size(); i++)
		{
			if(listOfEmployees.get(i).getName().equalsIgnoreCase(name))
			{
				employeeFound = true;
			  listOfEmployees.remove(i);
			  break;
			}
			
		}
		if(employeeFound)
		{
			IO.println("Employee Record Deleted successfully.");
		}
		else
		{
			IO.println("Employee with Name "+name+" not Found.");
		}
	}
	
}

public class EmployeeDirectoryExample 
{
	public static void main(String[] args) 
	{
		Directory d1 = new Directory();
		
		while(true)
		{
			
			IO.println("\nSelect Your choice :");
			IO.println("1. Add Empployee Data");
			IO.println("2. Display All Employee Data");
			IO.println("3. Update Employee Data");
			IO.println("4. Deleted Employee Data");
			IO.println("5. To Exit");
			
			int choice = Integer.parseInt(IO.readln("Enter Your Choice : "));
			switch(choice)
			{
			case 1 ->
			{
				d1.addEmployee();
			}
			case 2 ->
			{
				d1.displayAllEmployee();
			}
			case 3 ->
			{
				d1.updateEmployee();
			}
			case 4 ->
			{
				d1.deleteEmployee();
			}
			case 5 ->
			{
				IO.println("Thank you for Coming.");
				System.exit(0);
			}
			}
		}

	}

}
