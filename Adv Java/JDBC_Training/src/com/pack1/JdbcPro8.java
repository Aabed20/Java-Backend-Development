package com.pack1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class JdbcPro8
{
	
	String driver ="oracle.jdbc.OracleDriver";
	String dbUrl ="jdbc:oracle:thin:@localhost:1521:orcl";
	String dbUName = "AABED";
	String dPwd = "PATHAN";
	
	
	Connection connect()
	{
		Connection con = null;
		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(dbUrl, dbUName, dPwd);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	
	void meth2()
	{
		IO.println("Implementing Callable Statement procedure");
		try
		{
			Connection con = connect();
			CallableStatement cstat = con.prepareCall("{Call RetrieveEmpData(?,?,?,?,?)}");
			String eid = IO.readln("Enter Employee Id : ");
			cstat.setString(1, eid);
			
			cstat.registerOutParameter(2, Types.VARCHAR);
			cstat.registerOutParameter(3, Types.VARCHAR);
			cstat.registerOutParameter(4, Types.NUMERIC);
			cstat.registerOutParameter(5, Types.NUMERIC);
			
			cstat.execute();
			IO.println("----Employee Details----");
			IO.println("Employee Id : "+eid);
			IO.println("Employee name : "+cstat.getString(2));
			IO.println("Employee desg : "+cstat.getString(3));
			IO.println("Employee Basic Salary : "+cstat.getInt(4));
			IO.println("Employee Total Salary : "+cstat.getInt(5));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	void meth1()
	{
		IO.println("Implementing CallableStatement");
	    try
	    {
	    	
	    	Connection con = connect();
	    	CallableStatement cstat = con.prepareCall("{call InsertData(?,?,?,?,?)}");
	    	
	    	String id = IO.readln("Enter your id : ");
	    	String name =  IO.readln("Enter your Name : ");
	    	String desgination = IO.readln("Enter your designation : ");
	    	int bsal = Integer.parseInt(IO.readln("Enter Your Basic Salary : "));
	    	
	    	float tsal =  (bsal+(0.35f*bsal)+(0.15f*bsal));
	    	
	    	cstat.setString(1, id);
	    	cstat.setString(2, name);
	    	cstat.setString(3, desgination);
	    	
	    	cstat.setInt(4, bsal);
	    	cstat.setFloat(5, tsal);
	    	
	    	cstat.execute();
	    	IO.println("Data Inserted ");
	    }
	    catch(Exception e)
	    {
	     	e.printStackTrace();
	    }
	}
	
	
	void meth3()
	{
	IO.println("Implementing callable Statement Function");
	try
	{
	Connection con = connect();
	CallableStatement cstat = con.prepareCall("{call ?:=RetrieveTsal(?)}");
	String eid = IO.readln("Enter Emp Id : ");
	cstat.setString(2, eid);
	cstat.registerOutParameter(1, Types.NUMERIC);
	cstat.execute();
	
	IO.println("-----Employee Details-----");
	IO.println("Employee Id : "+eid);
	IO.println("Employee Total Salary : "+cstat.getInt(1));
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		
	}
	
	public static void main(String[] args)
	{
		JdbcPro8 obj = new JdbcPro8();
	//	obj.meth1();
		//obj.meth2();
		obj.meth3();
	}

}
