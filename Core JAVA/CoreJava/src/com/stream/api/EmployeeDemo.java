package com.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo
{
	public static void main(String[] args)
	{
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101, "Aabed", 40000, 310));
		emp.add(new Employee(102, "Rahil", 35000, 305));
		emp.add(new Employee(103, "Asef", 30000, 299));
		emp.add(new Employee(104, "Tejas", 25000, 290));

		List<Employee> emp1 = addBonus(emp);
		
	//	emp1.forEach(IO::println);
	}
	
	public static List<Employee> addBonus(List<Employee> emp)
	{
		List<Employee> e1 = emp;
		List<Employee> e2 = e1.stream()
		 .filter(e ->e.getDaysWorked()>300)
		  .map(e->
		  {
			  double sal=e.getSalary();
			  double bonus = sal*0.15;
			  e.setSalary(sal+bonus);
			  return e;
		  })
		  .collect(Collectors.toList());
		
		Double totalSal = e1.stream()
		  .collect(Collectors.summingDouble(e->e.getSalary()));
		
	//	IO.println(totalSal);
		e1.forEach(IO::println);
		return e2;
	}

}
