package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProfileDAO 
{
	public int updateProfile(UserBean ub)
	{
		int rowCount =0 ;
		try
		{
			Connection con = DBConnect.getCon();
			PreparedStatement pstat = con.prepareStatement("update registration set firstname=?, lastname=?,mailid=?,phone=? where username=? ");
			pstat.setString(1, ub.getFirstName());
			pstat.setString(2, ub.getLastName());
			pstat.setString(3, ub.getEmailId());
			pstat.setString(4, ub.getPhoneNumber());
			pstat.setString(5, ub.getUserName());
			rowCount = pstat.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return rowCount;
	}

}
