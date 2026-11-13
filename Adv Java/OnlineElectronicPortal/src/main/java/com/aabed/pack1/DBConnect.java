package com.aabed.pack1;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnect 
{
static Connection con= null;
	
	static
	{
		try
		{
		Class.forName(DBInfo.driver);
		con = DriverManager.getConnection(DBInfo.dbUrl, DBInfo.userName, DBInfo.pwd);
		}
		catch(Exception e)
		{
			System.out.println("Problem in Connection Object");
		} 
	}
	
	public static Connection getConnect()
	{
		return con;
	}

}
