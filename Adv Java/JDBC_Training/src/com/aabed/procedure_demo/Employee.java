package com.aabed.procedure_demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Employee {
	
	private static String driver = "oracle.jdbc.OracleDriver";
	private static String dbUrl = "jdbc:oracle:thin:@localhost:1521:ORCL";
	private static String Uname = "AABED";
	private static String pwd = "pathan";
	
	public static Connection getCon()
	{
		
		Connection con = null;
		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(dbUrl, Uname, pwd);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void insert_data()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Details : ");
		System.out.print("Enter Employee Name : ");
		String name = sc.nextLine();
		System.out.print("Enter Employee Salary : ");
		double salary = Double.parseDouble(sc.nextLine());
		
		Connection con = Employee.getCon();
		try
		{
	    CallableStatement cstmt=con.prepareCall("{call insert_employee(?,?)}");
	    cstmt.setString(1, name);
	    cstmt.setDouble(2, salary);
	    
	    int rows=cstmt.executeUpdate();
	    if(rows>0)
	    {
	    	System.out.println("Employee Inserted Successfully!");
	    }
	    else
	    {
	    	System.out.println("Employee not Inserted ");
	    }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

	public static void main(String[] args) 
	{
		Employee.insert_data();

	}

}
