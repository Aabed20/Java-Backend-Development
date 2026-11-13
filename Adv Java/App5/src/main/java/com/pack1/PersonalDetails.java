package com.pack1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/pd")
public class PersonalDetails extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
	  String name = req.getParameter("name");
	  int age = Integer.parseInt(req.getParameter("age"));
	  long mobile = Long.parseLong(req.getParameter("mobile"));
	  String gender = req.getParameter("gender");
	      String[] parameterValues = req.getParameterValues("hobies");
	      
	      
	      PrintWriter pw = res.getWriter();
	      res.setContentType("text/html");
	      
	      pw.print("<center><h3>");
	      pw.println("Name : "+name+"<br><br>");
	      pw.println("Age : "+age+"<br><br>");
	      pw.println("Mobile number : "+mobile+"<br><br>");
	      pw.println("Gender : "+gender+"<br><br>");
	      pw.println("Hobbies : ");
	      for(String str:parameterValues)
	      {
	    	   pw.print(str+" ");
	      }
	      pw.print("</h3></center>");
	      
		
	}

}
