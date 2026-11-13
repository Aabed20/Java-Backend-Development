package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcPro1 
{
	String driver = "oracle.jdbc.OracleDriver";
	String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String dbUname = "AABED";
	String dbPwd = "PATHAN";	
	
	
   void connect()
   {
	   IO.println("Connecting to the database");
	   try
	   {
		   Class.forName(driver);
		   Connection con = DriverManager.getConnection(dbUrl,dbUname,dbPwd);
	       IO.println("Connection Created"); 
		   con.close();
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
	
	public static void main(String[] args)
	{
		JdbcPro1 obj = new JdbcPro1();
		obj.connect();
	}
}
