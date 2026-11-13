package com.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.connections.ConnectionProvider;
import com.models.Employee;

public class EmployeeDao 
{
	private static Connection con = ConnectionProvider.getConnection();
	private static String insertQuery = "insert into employee2(name,department,salary) values(?,?,?)"; 
	
	public static int insertEmployeeData(Employee emp)
	{
		int result=0;
		try
		{
			PreparedStatement pstmt = con.prepareStatement(insertQuery);
			
			pstmt.setString(1, emp.getName());
			pstmt.setString(2, emp.getDepartment());
			pstmt.setDouble(3, emp.getSalary());
			
			result=pstmt.executeUpdate();
		}
	catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return result;
	}
	

}
