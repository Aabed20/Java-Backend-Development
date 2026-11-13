package com.stream_api.map;

import java.util.ArrayList;

import com.stream_api.filter.Employee;

public class FetchEmployeeNames
{
	public static void main(String[] args)
	{
   ArrayList<Employee> list = new ArrayList<Employee>();
        
		list.add(new Employee(101,"Aabed",80000));
		list.add(new Employee(102,"Rahil",70000));
		list.add(new Employee(103,"Asef",45000));
		list.add(new Employee(104,"Tejes",50000));
		
		list.stream()
		.map(e-> e.getEmployeeName())
		 .forEach(IO::println);
		
	}

}
