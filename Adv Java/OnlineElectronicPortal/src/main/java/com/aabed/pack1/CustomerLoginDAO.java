package com.aabed.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerLoginDAO 
{
	public int checkDetails(CustomerBean cb)
	{
		int rowCount =0;
		try
		{
			Connection con = DBConnect.getConnect();
			PreparedStatement pstat = con.prepareStatement("select * from customer where uname=? and pword=?");
			pstat.setString(1, cb.getuName());
			pstat.setString(2, cb.getuPass());
			ResultSet rs = pstat.executeQuery();
			if(rs.next())
			{
				rowCount =1;
				cb.setfName(rs.getString(3));
				cb.setlName(rs.getString(4));
				cb.setAddr(rs.getString(5));
				cb.setMid(rs.getString(6));
				cb.setPhNo(rs.getString(7));
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rowCount;
	}

	public int customerAvailable(CustomerBean cb)
	{
		int rowCount =0;
		try
		{
			Connection con = DBConnect.getConnect();
			PreparedStatement pstat = con.prepareStatement("select * from customer where phno=?");
			pstat.setString(1, cb.getPhNo());
			
			ResultSet rs = pstat.executeQuery();
			if(rs.next())
			{
				rowCount =1;
			}
			else
			{
				rowCount =0;
				PreparedStatement pstat2 = con.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
			    pstat2.setString(1, cb.getuName());
			    pstat2.setString(2, cb.getuPass());
			    pstat2.setString(3, cb.getfName());
			    pstat2.setString(4, cb.getlName());
			    pstat2.setString(5, cb.getAddr());
			    pstat2.setString(6, cb.getMid());
			    pstat2.setString(7, cb.getPhNo());
			    
			    int data_inserted = pstat2.executeUpdate();
			    
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return rowCount;
	}
	
}
