package com.aabed.stream_api;

import java.util.ArrayList;

record Employee(Integer id, String name, Double salary)
{}


public class EmployeeNameInUpperCase 
{
	public static void main(String[] args)
	{
		ArrayList<Employee> listOfEmp = new ArrayList<>();
		
		listOfEmp.add(new Employee(101,"Aabed",60000d));
		listOfEmp.add(new Employee(102,"Scott",65000d));
		listOfEmp.add(new Employee(103,"Ash",50000d));
		listOfEmp.add(new Employee(104,"Asif",55000d));
		listOfEmp.add(new Employee(105,"Smith",40000d));
		listOfEmp.add(new Employee(106,"Alen",45000d));
		
		listOfEmp.stream()
		   .filter(emp -> emp.salary()>50000)
		   .map(emp -> emp.name().toUpperCase())
		   .forEach(IO::println);

	}

}
