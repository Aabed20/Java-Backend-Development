package com.anymatch_allmatch.nonematch;

import java.util.Arrays;
import java.util.List;

public class CheckIfNoEmployeeHasNull
{
	public static void main(String[] args)
	{
		List<Employee> list = Arrays.asList(new Employee(101, "Aabed", 50000),new Employee(102, "Asef", 10000),new Employee(103,"Rahil",40000));
		
	 	boolean noneMatch = list.stream()
	 	    .noneMatch(e -> e.getEmployeeName()==null);

	 	IO.print(noneMatch);
	}

}
