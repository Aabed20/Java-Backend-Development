package com.book_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO 
{
	private static String driver = "oracle.jdbc.OracleDriver";
	private static String dbUrl = "jdbc:oracle:thin:@localhost:1521:ORCL";
	private static String Uname = "AABED";
	private static String pwd = "pathan";
	
	public static Connection getCon()
	{
		
		Connection con = null;
		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(dbUrl, Uname, pwd);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return con;
	}
	
	public int addBook(Book bk)
	{
		int rows =0;
		Connection con=DAO.getCon();
		try
		{
		PreparedStatement pstat=con.prepareStatement("insert into book values(?,?,?,?,?,?,?,?)");
		pstat.setInt(1, bk.getBookid());
		pstat.setString(2, bk.getBookName());
		pstat.setString(3, bk.getAuthor());
		pstat.setString(4, bk.getPublisher());
		pstat.setInt(5, bk.getPrice());
		pstat.setInt(6, bk.getQuantity());
		pstat.setString(7, bk.getCategory());
		pstat.setInt(8, bk.getIsbn());
		
		rows = pstat.executeUpdate();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rows;
	}
	

	

}
