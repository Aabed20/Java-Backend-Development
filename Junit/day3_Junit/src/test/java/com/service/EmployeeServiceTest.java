package com.service;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.models.Employee;

@RunWith(Parameterized.class)
public class EmployeeServiceTest 
{
   private EmployeeService service = new EmployeeService();
   private Employee emp;
   
   public EmployeeServiceTest(String name,String department,double salary)
   {
	   this.emp= new Employee(name,department,salary);
	   
   }
   
   @Parameters
   public static List<Object[]> data()
   {
	   Object[][] arr= {
			   {"Aabed","IT",50000},
			   {"Rahil","Testing",30000},
			   {"Asef","Database",35000}
	              };
	   
	   return Arrays.asList(arr);
   }
   
   @Test
   public void testInsert()
   {
	   int result = service.insertEmployeeAfterValidation(emp);
	   assertEquals(1, result);
   }
   
   
	
}
