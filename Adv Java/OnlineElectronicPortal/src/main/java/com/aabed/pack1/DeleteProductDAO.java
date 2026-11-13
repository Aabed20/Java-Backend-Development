package com.aabed.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteProductDAO 
{

	public int deleteProduct(String pcode)
	{
		int rowCount =0; 
		try
		{
			Connection con = DBConnect.getConnect();
			PreparedStatement pstat = con.prepareStatement("delete from product where pcode=?");
			pstat.setString(1, pcode);
			rowCount = pstat.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rowCount;
	}
}
