package com.leave;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addLeave")
public class ApplyingForLeave extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	{
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		  String type = req.getParameter("type");
		String sdate=(String)(req.getParameter("sdate"));
		String edate=(String)(req.getParameter("edate"));
	
		Connection con=ConnectionObj.getCon();
		try
		{
			PreparedStatement pstat=con.prepareStatement("insert into emp_leave values(?,?,?,?,?,?)");
		    pstat.setInt(1, id);
		    pstat.setString(2, name);
		    pstat.setString(3, type);
		    pstat.setString(4, sdate);
		    pstat.setString(5, edate);
		    pstat.setString(6, "Pending");
		    
		   int rows = pstat.executeUpdate();
		    if(rows>0)
		    {
		    	req.getRequestDispatcher("success.jsp").forward(req, res);
		    }
		    else
		    {
		    	req.getRequestDispatcher("fail.jsp").forward(req, res);
		    }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
