package com.aabed.procedure_demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class Student_Display
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
	
	public static void display_data()
	{
		Connection con = Student_Display.getCon();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID : ");
		int id = Integer.parseInt(sc.nextLine());
		
		try
		{
		CallableStatement cstmt=con.prepareCall("{call displayStudent(?,?,?,?,?,?,?,?,?)}");
	     cstmt.setInt(1, id);
		 cstmt.registerOutParameter(2, Types.VARCHAR);
		 cstmt.registerOutParameter(3, Types.VARCHAR);
		 cstmt.registerOutParameter(4, Types.VARCHAR);
		 cstmt.registerOutParameter(5, Types.VARCHAR);
		 cstmt.registerOutParameter(6, Types.VARCHAR);
		 cstmt.registerOutParameter(7, Types.VARCHAR);
		 cstmt.registerOutParameter(8, Types.VARCHAR);
		 cstmt.registerOutParameter(9, Types.VARCHAR);
		
		 cstmt.execute();
		
		System.out.println("------ Student Information ------");
		System.out.println("Student ID   : "+id);
		System.out.println("First Name   : "+cstmt.getString(2));
		System.out.println("Last Name    : "+cstmt.getString(3));
		System.out.println("Class        : "+cstmt.getString(4));
		System.out.println("\n------ Student Address ------");
		System.out.println("City         : "+cstmt.getString(5));
		System.out.println("State        : "+cstmt.getString(6));
		System.out.println("Pincode      : "+cstmt.getString(7));
		System.out.println("\n------ Student Contact ------");
		System.out.println("Email        : "+cstmt.getString(8));
		System.out.println("Mobile Number: "+cstmt.getString(9));
		}
		catch(SQLException e)
		{
		if (e.getErrorCode() == 1403) 
		{
	        System.out.println("Student ID not found.");
	    }
		else 
	    {
	        e.printStackTrace();
	    }
		}
		finally
		{
			sc.close();
		}
	}
	public static void main(String[] args)
	{
		display_data();

	}

}
