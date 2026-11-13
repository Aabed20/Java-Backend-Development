package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider 
{
	private static Connection con = null;
	private static String driver="oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static String userName="AABED";
	private static String password = "pathan";
	
	public static Connection getConnection()
	{
		try
		{
			Class.forName(driver);
			
			con=DriverManager.getConnection(url, userName, password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}

}
