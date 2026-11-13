package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLIntegrityConstraintViolationException;

public class AddEmpDAO
{

	public int insertEmpData(EmpBean eb)
	{
		int rowCount =0;
		try
		{
		   Connection con = DBConnect.getCon();
		   PreparedStatement pstat = con.prepareStatement("insert into employee values(?,?,?,?,?)");
		   pstat.setString(1, eb.getEmp_id());
		   pstat.setString(2, eb.getEmp_fname());
		   pstat.setString(3, eb.getEmp_lname());
		   pstat.setInt(4, eb.getEmp_sal());
		   pstat.setString(5, eb.getEmp_addr());
		   
		    rowCount = pstat.executeUpdate();
		}
		catch(SQLIntegrityConstraintViolationException s)
		{
			System.out.println("Duplicate empIds are not allowed");
			s.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rowCount;
	}
}
