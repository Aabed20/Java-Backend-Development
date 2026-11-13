package com.aabed.stream_api;

import java.util.ArrayList;
import java.util.List;

record Employee2(Integer id, Double salary) {}

public class FilterEmpBasedOnSalary 
{
	public static void main(String[] args)
	{
		ArrayList<Employee2> list = new ArrayList<>();

		list.add(new Employee2(102,50000d));
		list.add(new Employee2(101,35000d));
		list.add(new Employee2(103,25000d));
		list.add(new Employee2(104,30000d));
		
		List<Employee2> list2 = list
		 .stream()
		  .filter((emp) -> emp.salary()>30000)
		     .toList();
		
		IO.println(list2);
	}

}
