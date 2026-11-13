package com.aabed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;

public class AdminDAO 
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
	
	public int reg(AdminBean ab)
	{
		int rows =0;
		
		try
		{
			Connection con = AdminDAO.getCon();
			PreparedStatement pstmt=con.prepareStatement("insert into admin values(?,?,?,?,?,?)");
			pstmt.setString(1, ab.getAdminName());
			pstmt.setString(2, ab.getAdminPass());
			pstmt.setString(3, ab.getAdminFirstName());
			pstmt.setString(4, ab.getAdminLastName());
			pstmt.setString(5, ab.getAdminMail());
			pstmt.setString(6, ab.getAdminPhone());
			
			rows=pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return rows;
	}
	
	public AdminBean login(HttpServletRequest req)
	{
		AdminBean ab = new AdminBean();
		if(!req.getParameter("aname").equals(null)&&req.getParameter("apass").equals(null))
		{
			try
			{
				Connection con = AdminDAO.getCon();
				PreparedStatement pstmt = con.prepareStatement("select * from admin where uname=? and pword=?");
			    pstmt.setString(1, req.getParameter("aname"));
			    pstmt.setString(2, req.getParameter("apass"));
			    ResultSet rs = pstmt.executeQuery();
			    
			    if(rs.next())
			    {
			    	ab.setAdminName(rs.getString(1));
			    	ab.setAdminPass(rs.getString(2));
			    	ab.setAdminFirstName(rs.getString(3));
			    	ab.setAdminLastName(rs.getString(4));
			    	ab.setAdminMail(rs.getString(5));
			    	ab.setAdminPhone(rs.getString(6));
			    	
			    }
			    else
			    {
			    	ab = null;
			    }
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		return ab;
	}
	
}
