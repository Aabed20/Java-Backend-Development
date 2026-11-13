package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcPro6 {

	static String driver = "oracle.jdbc.OracleDriver";
	static String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
	static String userName = "AABED";
	static String pwd = "PATHAN";
	
	
	public Connection Connect()
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
	   IO.println("Method 1 called");
	   IO.println(ResultSet.TYPE_FORWARD_ONLY);
	   IO.println(ResultSet.TYPE_SCROLL_INSENSITIVE);
	   IO.println(ResultSet.TYPE_SCROLL_SENSITIVE);
	   IO.println(ResultSet.CONCUR_READ_ONLY);
	   IO.println(ResultSet.CONCUR_UPDATABLE);
	}
	
	void meth2()
	{
		IO.println("Implementing Scrollable ResultSet ===> Updatable");
		Connection con = Connect();
		try
		{
			Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stat.executeQuery("select eid,efname,esal from employee");
			while(rs.next())
			{
				String e_id = rs.getString(1);
				if(e_id.equals("102"))
				{
					rs.updateInt(3, 15000);
					rs.updateRow();
				}
			}
			IO.println("Data Updated !!!\n");
			rs.absolute(3);
			IO.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		JdbcPro6 obj = new JdbcPro6();
		obj.meth2();
		//obj.meth1();

	}

}











