package com.pack1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.sql.RowSetMetaData;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class JdbcPro11 
{
	String driver ="oracle.jdbc.OracleDriver";
	String dbUrl ="jdbc:oracle:thin:@localhost:1521:orcl";
	String dbUName = "AABED";
	String dPwd = "PATHAN";
	String query = "select * from employee where eid=?";
	
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
	
	void meth1()
	{
		IO.println("Implementing metadata...");
		Connection con = connect();
		try
		{
			DatabaseMetaData dmdt = con.getMetaData();
			IO.println("getDatabaseProductName() : "+dmdt.getDatabaseProductName());
			IO.println("getDatabaseProductVersion() : "+dmdt.getDatabaseProductVersion());
			IO.println("getDriverName() : "+dmdt.getDriverName());
			IO.println("supportsStoredProcedur : "+dmdt.supportsStoredProcedures());

			IO.println("--------------------------");
			
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, "101");
			ResultSet rs =pstmt.executeQuery();
			ParameterMetaData pmtdta = pstmt.getParameterMetaData();
			IO.println("getParameterCount() : "+pmtdta.getParameterCount());
			IO.println("getParameterType() : "+pmtdta.getParameterType(1));
			IO.println("getParameterMode() : "+pmtdta.getParameterMode(1));
			IO.println("isNullable() : "+pmtdta.isNullable(1));
			
			IO.println("----------------------------");
			ResultSetMetaData rsmtdt =rs.getMetaData();
			IO.println("getColumnCount() : "+rsmtdt.getColumnCount());
			IO.println("getColumnName() : "+rsmtdt.getColumnName(2));
			IO.println("getColumnDisplaySize() : "+rsmtdt.getColumnDisplaySize(4));
			IO.println("isAutoIncrement() : "+rsmtdt.isAutoIncrement(1));
			
            IO.println("------------------");
            
            RowSetFactory rsf = RowSetProvider.newFactory();
            CachedRowSet crs = rsf.createCachedRowSet();
            crs.setUrl(dbUrl);
            crs.setUsername(dbUName);
            crs.setPassword(dPwd);
            crs.setCommand("select eid,efname, esal from employee");
            crs.execute();
            
            RowSetMetaData rowmtdt = (RowSetMetaData)crs.getMetaData();
            IO.println("getColumnCount() : "+rowmtdt.getColumnCount());
            IO.println("getColumnName() : "+rowmtdt.getColumnName(2));
            IO.println("getColumnDisplaySize() : "+rowmtdt.getColumnDisplaySize(1));
            IO.println("isAutoIncrement() : "+rowmtdt.isAutoIncrement(1));
            IO.println("getColumnType() : "+rowmtdt.getColumnType(1));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args)
	{
		JdbcPro11 obj = new JdbcPro11();
		obj.meth1();

	}

}
