package com.aabed.procedure_demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Student 
{
	
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
		System.out.println("Enter Student Details : ");
		System.out.print("Enter Student ID : ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("Enter First name : ");
		String fname = (sc.nextLine());
		System.out.print("Enter Last name : ");
		String lname = (sc.nextLine());
		System.out.print("Enter Class : ");
		String class1 = sc.nextLine();
		System.out.print("Enter City : ");
		String city =sc.nextLine();
		System.out.print("Enter State : ");
		String state = sc.nextLine();
		System.out.print("Enter Pincode : ");
		String pincode = sc.nextLine();
		System.out.print("Enter Email : ");
		String email = sc.nextLine();
		System.out.print("Enter Mobile Number : ");
		String mobile = sc.nextLine();
		
		Connection con = Student.getCon();
		try
		{
	    CallableStatement cstmt=con.prepareCall("{call addStudent(?,?,?,?,?,?,?,?,?)}");
	  
	    cstmt.setInt(1, id);
	    cstmt.setString(2, fname);
	    cstmt.setString(3, lname);
	    cstmt.setString(4, class1);
	    cstmt.setString(5, city);
	    cstmt.setString(6, state);
	    cstmt.setString(7, pincode);
	    cstmt.setString(8, email);
	    cstmt.setString(9, mobile);
	    
	    int rows=cstmt.executeUpdate();
	    if(rows>0)
	    {
	    	System.out.println("Student Registered Successfully!");
	    }
	    else
	    {
	    	System.out.println("Student not Inserted ");
	    }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args)
	{
      Student.insert_data();		

	}

}
