package com.service;

import com.daos.EmployeeDao;
import com.models.Employee;

public class EmployeeService 
{
	
	public int insertEmployeeAfterValidation(Employee emp)
	{
		int result =0;
	     if(!emp.getName().isBlank()&&!emp.getDepartment().isBlank()&&emp.getSalary()>0)
	     {
	    	 result=EmployeeDao.insertEmployeeData(emp);
	    	 if(result==1)
	    	 {
	    		 System.out.println("Employee Data inserted Successfully");
	    	 }
	    	 else
	    	 {
	    		 System.out.println("Employee Data not inserted");
	    	 }
	     }
	     else
	     {
	    	 System.out.println("Input validation failed, operation cannot be performed");
	    	 System.out.println("Please check all the fields are mandatory");
	     }
	     
	     return result;
	}

}
