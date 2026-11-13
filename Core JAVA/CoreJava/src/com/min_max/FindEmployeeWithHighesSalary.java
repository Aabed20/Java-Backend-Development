package com.min_max;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindEmployeeWithHighesSalary
{
	public static void main(String[] args)
	{
		List<Employee> list = Arrays.asList(new Employee(101, "Aabed", 50000),new Employee(102, "Asef", 40000),new Employee(103, "Rahil", 80000));
		
		Optional<Employee> max = list.stream()
		  .max((a,b) ->Double.compare(a.getSalary(), b.getSalary()));

		IO.print(max.get());
	}

}
