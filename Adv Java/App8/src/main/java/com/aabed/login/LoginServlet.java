package com.aabed.login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/log")
public class LoginServlet extends HttpServlet
{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	{
	   String name = req.getParameter("name");
	   String pass = req.getParameter("pass");
	   
	   try
	   {
		   Connection con = ConnectionObject.getConnect();
		   Statement stat = con.createStatement();
		   ResultSet rs = stat.executeQuery("select * from Admin");
		   while(rs.next())
		   {
			   if(rs.getString(1).equals(name)&&rs.getString(2).equals(pass))
			   {
				   
			   }
		   }
	   }
	   catch(Exception e)
	   {
		e.printStackTrace();   
	   }
		
	}

}
