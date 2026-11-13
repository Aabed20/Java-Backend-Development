package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewEmpDAO 
{

	ArrayList<EmpBean> al = new ArrayList<>();
	
	public ArrayList<EmpBean> retrieve_empData()
	{
		try
		{
			Connection con = DBConnect.getCon();
			PreparedStatement pstat = con.prepareStatement("select * from employee");
			ResultSet rs = pstat.executeQuery();
			while(rs.next())
			{
				EmpBean eb = new EmpBean();
				eb.setEmp_id(rs.getString(1));
				eb.setEmp_fname(rs.getString(2));
				eb.setEmp_lname(rs.getString(3));
				eb.setEmp_sal(rs.getInt(4));
				eb.setEmp_addr(rs.getString(5));
				al.add(eb);
			}
		}
		catch(Exception e)
		{
			System.out.println("Problem occred at ViewEmpDAO");
			e.printStackTrace();
		}
		return al;
	}
}
