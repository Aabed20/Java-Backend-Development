package com.stream_api.limit_skip;

import java.util.Arrays;
import java.util.List;

import com.stream_api.flatmap.Employee;

public class Print2ndHighestSalaryemployee
{
	public static void main(String[] args)
	{
		List<Employee> list = Arrays.asList(new Employee(101, "Priya", 50000),new Employee(102, "Abhishek", 80000),new Employee(201, "Aabed", 60000),new Employee(202, "Rahil", 40000));
		
		list
		.stream()
		 .sorted((e1,e2)->Double.compare(e2.getSalary(), e1.getSalary()))
		  .skip(1)
		   .limit(1)
		   .forEach(IO::println);

	}

}
