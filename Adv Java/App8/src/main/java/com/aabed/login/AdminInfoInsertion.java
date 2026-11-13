package com.aabed.login;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AdminInfoInsertion 
{

	public int insert(AdminBean ab)
	{
		int rowCount = 0;
		
		try
		{
		  Connection con = ConnectionObject.getConnect();	
		   PreparedStatement pstat = con.prepareStatement("insert into Admin values(?,?,?,?,?,?)");
		    pstat.setString(1, ab.getName());
		    pstat.setString(2, ab.getPass());
		    pstat.setString(3, ab.getfName());
		    pstat.setString(4, ab.getlName());
		    pstat.setString(5, ab.getMailId());
		    pstat.setString(6, ab.getPhNo());
		    
		    rowCount = pstat.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println("problem in Insertion");
		}
		
		return rowCount;
	}
}
