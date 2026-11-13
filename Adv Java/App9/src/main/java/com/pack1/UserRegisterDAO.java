package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

public class UserRegisterDAO 
{

	public static int insertData(UserBean ub)
	{
		int rowCount =0;
		try
		{
			Connection con = DBConnect.getCon();
			PreparedStatement pstat = con.prepareStatement("insert into registration values(?,?,?,?,?,?)");
			
			pstat.setString(1, ub.getUserName());
			pstat.setString(2, ub.getPassword());
			pstat.setString(3, ub.getFirstName());
			pstat.setString(4, ub.getLastName());
			pstat.setString(5, ub.getEmailId());
			pstat.setString(6, ub.getPhoneNumber());
			
			rowCount = pstat.executeUpdate();
			
		}
		catch(SQLIntegrityConstraintViolationException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return rowCount;
	}
}
