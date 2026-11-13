package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;

public class ConnectionPool
{

	String driver,dburl,dbUname,dbPwd;
	Vector<Connection> v = new Vector<Connection>();
	
	public ConnectionPool(String driver, String dburl, String dbUname, String dbPwd) {
		super();
		this.driver = driver;
		this.dburl = dburl;
		this.dbUname = dbUname;
		this.dbPwd = dbPwd;
	
	}
	
	public void con_Initialization()
	{
		IO.println("ConnectionPool is Empty");
		IO.println("There are "+v.size()+" Connection Objects");
		while(v.size()<5)
		{
			try
			{
				Class.forName(driver);
				Connection con = DriverManager.getConnection(dburl, dbUname, dbPwd);
				v.addElement(con);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		for(Object o:v)
		{
			IO.println(o);
		}
		IO.println("There are "+v.size()+" Connection Objects");
	}
		
	public Connection con_Acquisition()
	{
		Connection con = v.get(0);
		v.remove(0);
		return con;
	}
		
	public void con_Return(Connection con)
	{
		IO.println("Adding the Connection Object to the ConnectionPool");
		v.addElement(con);
		IO.println("There are "+v.size()+" Connection Objects");
		for(Object o:v)
			IO.println(o);
	}
}
