package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect 
{

	static Connection con=null;
	
	static
	{
	    try
	    {
	        Class.forName("oracle.jdbc.driver.OracleDriver");

	        con = DriverManager.getConnection(
	                DBInfo.dbUrl,
	                DBInfo.userName,
	                DBInfo.pwd);

	        System.out.println("Connection created successfully");
	    }
	    catch(Exception e)
	    {
	        System.out.println("Exception occurred in DBConnect Class");
	        e.printStackTrace();
	    }
	}

	
	public static Connection getCon()
	{
		return con;
	}
}