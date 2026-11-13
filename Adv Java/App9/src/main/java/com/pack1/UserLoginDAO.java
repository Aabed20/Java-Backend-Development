package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserLoginDAO 
{

	public UserBean login(String username,String password)
	{
		UserBean ub = null;
		try
		{
			Connection con = DBConnect.getCon();
			PreparedStatement pstat = con.prepareStatement("select * from registration where username=? and password=?");
		
			pstat.setString(1, username);
			pstat.setString(2, password);
			
			ResultSet rs = pstat.executeQuery();
			if(rs.next())
			{
				ub = new UserBean();
				ub.setUserName(rs.getString(1));
				ub.setPassword(rs.getString(2));
				ub.setFirstName(rs.getString(3));
				ub.setLastName(rs.getString(4));
				ub.setEmailId(rs.getString(5));
				ub.setPhoneNumber(rs.getString(6));
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured in UserLoginDAO ");
			e.printStackTrace();
		}
		return ub;
	}
}
