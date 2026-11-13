package com.leave;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewdata")
public class ShowLeaves extends HttpServlet
{
     public void doGet(HttpServletRequest req, HttpServletResponse res)
     {
    	 try
    	 {
    	  Connection con=ConnectionObj.getCon();
          Statement stat=con.createStatement();
          ResultSet rs=stat.executeQuery("select * from emp_leave");
          ArrayList<Employee> al = new ArrayList<>();
          while(rs.next())
          {
        	  Employee e = new Employee();
        	  e.id=rs.getInt(1);
        	  e.name = rs.getString(2);
        	  e.type = rs.getString(3);
        	  e.sdate = rs.getString(4);
        	  e.edate = rs.getString(5);
        	  e.status = rs.getString(6);
        	  al.add(e);
        			  
          }
          req.setAttribute("data", al);
          req.getRequestDispatcher("show.jsp").forward(req, res);
          
    	 }
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
    	 
     }
}
