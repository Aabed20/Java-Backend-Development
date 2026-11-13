package com.aabed.products_servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminValidation 
{
	
	public static AdminBean validate(String uname, String pwd)
	{
		AdminBean ab =null;
		try
		{
			Connection con = DBConnect.getCon();
			PreparedStatement pstat = con.prepareStatement("select * from admin where uname=? and pword=?");
			
			pstat.setString(1, uname);
			pstat.setString(2, pwd);
			ResultSet rs = pstat.executeQuery();
			if(rs.next())
			{
				ab = new AdminBean();
				ab.setUserName(rs.getString(1));
				ab.setPassword(rs.getString(2));
				ab.setFname(rs.getString(3));
				ab.setLname(rs.getString(4));
				ab.setAddr(rs.getString(5));
				ab.setMail(rs.getString(6));
				ab.setPhone(rs.getString(7));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return ab;
	}

}
