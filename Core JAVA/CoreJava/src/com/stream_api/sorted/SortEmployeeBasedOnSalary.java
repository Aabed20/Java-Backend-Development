package com.stream_api.sorted;

import java.util.ArrayList;
import java.util.List;

import com.stream_api.filter.Employee;

public class SortEmployeeBasedOnSalary
{
	public static void main(String[] args)
	{
       ArrayList<Employee> list = new ArrayList<Employee>();
        
		list.add(new Employee(101,"Aabed",80000));
		list.add(new Employee(102,"Rahil",70000));
		list.add(new Employee(103,"Asef",45000));
		list.add(new Employee(104,"Tejes",50000));
		
		List<Employee> list2 = list.stream()
		  .sorted((e1,e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
		   .toList();
		//IO.println(list2);
		
		List<Employee> list3 = list.stream()
		.sorted((e1,e2) ->e1.getEmployeeName().compareTo(e2.getEmployeeName()))
		 .toList();
		
	//	IO.println(list3);
		
		list.stream()
		 .sorted((e1,e2) ->e1.getEmployeeName().compareToIgnoreCase(e2.getEmployeeName())).forEach(IO::println);

	}

}
