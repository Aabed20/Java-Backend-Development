package com.aabed.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddProductDAO 
{

	public int insertProduct(ProductBean pb) throws Exception
	{
		int rowCount=0;
		try
		{
			Connection con = DBConnect.getConnect();
			PreparedStatement pstat = con.prepareStatement("insert into product values(?,?,?,?,?)");
			pstat.setString(1, pb.getPcode());
			pstat.setString(2, pb.getPname());
			pstat.setString(3, pb.getPcompany());
			pstat.setString(4, pb.getPprice());
			pstat.setString(5, pb.getPqty());
			
			rowCount = pstat.executeUpdate();
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			throw e;
		}
		return rowCount;
	}
}
