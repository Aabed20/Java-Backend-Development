package com.aabed.products_servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertProductData 
{

	public static int insertData(ProductBean pb)
	{
		int rowCount = 0;
		
		try
		{
			Connection con = DBConnect.getCon();
			PreparedStatement pstat = con.prepareStatement("insert into products values(?,?,?,?)");
			
			pstat.setString(1, pb.getProduct_id());
			pstat.setString(2, pb.getProduct_name());
			pstat.setDouble(3, pb.getProduct_price());
			pstat.setInt(4, pb.getProduct_qty());
			
			 rowCount = pstat.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return rowCount;
	}
	
}
