package com.pack1;

import java.sql.Connection;

public class JdbcPro10 
{
	String driver ="oracle.jdbc.OracleDriver";
	String dbUrl ="jdbc:oracle:thin:@localhost:1521:orcl";
	String dbUName = "AABED";
	String dPwd = "PATHAN";
	
	void meth1()
	{
		ConnectionPool cp = new ConnectionPool(driver,dbUrl,dbUName,dPwd);
	    cp.con_Initialization();
	    IO.println("\n--------User 1 ---------");
	    Connection con1 = cp.con_Acquisition();
	    IO.println("User 1 : "+con1);
	    IO.println("===>"+cp.v.size());
	    
	    IO.println("\n-------User 2-----------");
	    Connection con2 = cp.con_Acquisition();
	    IO.println("User 2 : "+con2);
	    IO.println("===>"+cp.v.size());
	    
	    IO.println("\n-------User 3-----------");
	    Connection con3 = cp.con_Acquisition();
	    IO.println("User 2 : "+con3);
	    IO.println("===>"+cp.v.size());
	    
	    IO.println("=====================");
	    cp.con_Return(con1);
	    cp.con_Return(con2);
	    cp.con_Return(con3);
	}

	public static void main(String[] args) 
	{
		JdbcPro10 obj = new JdbcPro10();
		obj.meth1();

	}

}
