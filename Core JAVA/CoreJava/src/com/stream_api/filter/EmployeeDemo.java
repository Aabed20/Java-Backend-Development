package com.stream_api.filter;

import java.util.ArrayList;

public class EmployeeDemo
{
	public static void main(String[] args) 
	{	   
		ArrayList<Employee> list = new ArrayList<Employee>();
        
		list.add(new Employee(101,"Aabed",80000));
		list.add(new Employee(102,"Rahil",70000));
		list.add(new Employee(103,"Asef",45000));
		list.add(new Employee(104,"Tejes",50000));
		
		list.stream()
		 .filter(n->n.getSalary()>50000)
		 .forEach(n->IO.println(n.getEmployeeName()));
	}

}
