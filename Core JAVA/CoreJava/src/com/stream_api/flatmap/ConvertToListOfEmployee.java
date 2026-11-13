package com.stream_api.flatmap;

import java.util.ArrayList;
import java.util.List;

public class ConvertToListOfEmployee
{
	public static void main(String[] args)
	{
	   List<Department> list = new ArrayList<>();
	   
	   list.add(new Department("hr",List.of(new Employee(101, "Priya", 50000),new Employee(102, "Abhishek", 60000))));
       list.add(new Department("Developer",List.of(new Employee(201, "Aabed", 50000),new Employee(202, "Rahil", 30000))));
       
       
       List<Employee> allEmployees = list.stream()
        .flatMap(department -> department.getE().stream())
          .toList();
        allEmployees.forEach(emp -> IO.println(emp.getEmployeeName()));
       
	}

}
