package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserLoginDAO 
{
	UserBean ub = null;
	
	public UserBean CheckLogin(String uname, String upwd)
	{
		try
		{
			Connection con = ConnectionObject.getConnect();
			PreparedStatement pstat = con.prepareStatement("select * from registration where username=? and password=?");
			pstat.setString(1, uname);
			pstat.setString(2, upwd);
			ResultSet rs = pstat.executeQuery();
			if(rs.next())
			{
				ub = new UserBean();
				ub.setUsername(rs.getString(1));
				ub.setPassword(rs.getString(2));
				ub.setFname(rs.getString(3));
				ub.setLname(rs.getString(4));
				ub.setMail(rs.getString(5));
				ub.setPhno(rs.getString(6));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ub;
	}

}
