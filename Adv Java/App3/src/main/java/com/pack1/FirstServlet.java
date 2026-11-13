package com.pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fs2")
public class FirstServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		String name =req.getParameter("empname");
		String id = req.getParameter("empid");
		String sal = req.getParameter("empsal");
		String exp = req.getParameter("empexp");
		
		double salary = Double.parseDouble(sal);
		
		int exper =Integer.parseInt(exp);
		if(exper>=5)
		{
			salary =salary+salary*0.1;
		}
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		pw.println("<center>");
		pw.println("----Employee Details-----<br>");
		pw.println("EmpName : "+name+"<br><br>");
		pw.println("EmpId : "+id+"<br><br>");
		pw.println("EmpSal : "+salary+"<br><br>");
		pw.println("EmpExp : "+exp+"<br><br>");
		pw.println("</h1></center>");
		
	}

	
}
