package com.aabed.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProductDAO 
{
	
	public int updateProduct(ProductBean pb)
	{
		int rowCount=0;
		try
		{
			Connection con = DBConnect.getConnect();
			PreparedStatement pstat = con.prepareStatement("update product set pprice=?,pqty=? where pcode=?");
			
			pstat.setString(1, pb.getPprice());
			pstat.setString(2, pb.getPqty());
			pstat.setString(3, pb.getPcode());
			
			rowCount=pstat.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rowCount;
	}
	
	public int updateProductQuantity(ProductBean pb)
	{
		int rowCount=0;
		try
		{
			Connection con = DBConnect.getConnect();
			PreparedStatement pstat = con.prepareStatement("update product set pqty=? where pcode=?");
			
			pstat.setString(1, pb.getPqty());
			pstat.setString(2, pb.getPcode());
			
			rowCount=pstat.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
		return rowCount;
	}

}
