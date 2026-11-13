package com.aabed.stream_api;

import java.util.ArrayList;

record Employee1(Integer id, Double salary) {}

public class SortEmpBySalInDescending
{
	public static void main(String[] args)
	{
		ArrayList<Employee1> list = new ArrayList<>();
		
		list.add(new Employee1(101,50000d));
		list.add(new Employee1(103,45000d));
		list.add(new Employee1(102,90000d));
		list.add(new Employee1(105,75000d));
		list.add(new Employee1(104,70000d));

		list.stream()
		  .sorted((emp1,emp2)-> Double.compare(emp2.salary(), emp1.salary()) ) 
		   .forEach(IO::println);
		   
	}

}
