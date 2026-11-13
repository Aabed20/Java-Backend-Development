package com.aabed.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLoginDAO 
{
	public AdminBean checkAdminLogin(String uname, String upwd)
	{
		AdminBean abean = null;
		
		try
		{
			Connection con = DBConnect.getConnect();
			PreparedStatement pstat = con.prepareStatement("select * from admin where uname=? and pword=?");
			
			pstat.setString(1, uname);
			pstat.setString(2, upwd);
			ResultSet rs = pstat.executeQuery();
			if(rs.next())
			{
				abean = new AdminBean();
				abean.setA_name(rs.getString(1));
				abean.setA_pwd(rs.getString(2));
				abean.setA_fname(rs.getString(3));
				abean.setA_lname(rs.getString(4));
				abean.setA_addr(rs.getString(5));
				abean.setA_mid(rs.getString(6));
				abean.setA_phno(rs.getString(7));
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return abean;
	}

}
