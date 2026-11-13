package com.aabed.products_servlet;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnect 
{
static Connection con = null;
	
	public static Connection getCon()
	{
		try
		{
		   Class.forName(DBInfo.driver);
		   con = DriverManager.getConnection(DBInfo.dbUrl,DBInfo.userName,DBInfo.pwd);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}

}
