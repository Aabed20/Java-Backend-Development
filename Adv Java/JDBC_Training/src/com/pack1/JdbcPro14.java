package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Scanner;

public class JdbcPro14 
{
	String driver = "oracle.jdbc.OracleDriver";
	 String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	 String userName = "AABED";
	 String pwd = "PATHAN";
	 static Scanner sc = new Scanner(System.in);
	 public Connection connect()
		{
			Connection con = null;
	       	try 
	       	{
	       		Class.forName(driver);
	          con =	DriverManager.getConnection(dbUrl, userName, pwd);
	       	}
	       	catch(Exception e)
	       	{
	       		e.printStackTrace();	
	       	}
	       	return con;
		}
	 
	 void meth1()
	 {
		 IO.println("Implementing Batch Processing!!!");
		 try
		 {
			 Connection con = connect();
			 Statement stat = con.createStatement();
			 IO.println("How many queries you want to add to the batch");
			 int noOfQueries= Integer.parseInt(sc.nextLine());
			 for(int i=1; i<=noOfQueries; i++)
			 {
				 IO.println("Enter your "+i+" query");
				 stat.addBatch(sc.nextLine());
				 IO.println("added");
			 }
			 IO.println(noOfQueries+" queries added to the batch.");
			 int rowCount[] = stat.executeBatch();
			 IO.println("====>"+Arrays.toString(rowCount));
			 stat.clearBatch();
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }

	public static void main(String[] args) 
	{
		JdbcPro14 obj = new JdbcPro14();
		obj.meth1();

	}

}
