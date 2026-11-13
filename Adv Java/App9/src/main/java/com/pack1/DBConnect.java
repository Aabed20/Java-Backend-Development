package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect 
{

	static Connection con ;
	
	public static Connection getCon()
	{
		try
		{
		   Class.forName(DBInfo.driver);
		   con = DriverManager.getConnection(DBInfo.dbUrl,DBInfo.dbUName,DBInfo.dPwd);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
