package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcPro2
{

	String driver = "oracle.jdbc.OracleDriver";
	String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userName = "AABED";
	String pwd = "PATHAN";
	String query = "select * from employee";
	
	void getEmpData()
	{
		IO.println("---------Employee Details---------\n");
	    try
	    {
	    	Class.forName(driver);
	     Connection con = DriverManager.getConnection(dbUrl, userName, pwd);
	     IO.println("Connection Created\n");
	         Statement stat = con.createStatement();
	         
	         ResultSet rs = stat.executeQuery(query);
	         
	         while(rs.next())
	         {
	        	 IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
	        
//	        	 if(rs.getString(5).contains("Hyd"))
//	        	 {
//	        		 IO.println(rs.getString(5));
//	        	 }
	        	 
	        	 
//	        	 if(rs.getString(2).length()>=5)
//	        	 {
//	        		 IO.println(rs.getString(2));
//	        	 }
	        	 
	        // int sal = rs.getInt(4);
//	         if(sal>50000)
//	         {
//	        	 IO.println(sal);
//	         }
	         
	         }
	     
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	
	    
	
	}
	public static void main(String[] args)
	{
		new JdbcPro2().getEmpData();
		
	}
	
}
