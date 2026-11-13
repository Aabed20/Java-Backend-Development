package com.leave;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionObj 
{
	private static String driver= "oracle.jdbc.OracleDriver";
	private static String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static String uname = "AABED";
	private static String password = "pathan";
	
	public static Connection getCon()
	{
		Connection con = null;
		try
		{
			Class.forName(driver);
			con=DriverManager.getConnection(dbUrl,uname,password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return con;
    }

}
