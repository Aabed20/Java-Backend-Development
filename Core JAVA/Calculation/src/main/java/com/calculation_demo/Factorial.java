package com.calculation_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ftr")
public class Factorial extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
int num = Integer.parseInt(req.getParameter("number").trim());
		
		PrintWriter writer = res.getWriter();
		res.setContentType("text/html");
		
		writer.println("<div style=\"display: flex; justify-content: center; align-items: center;\"><h3>");
		
		int fact =1;
		if(num>0)
		{
		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		writer.println(num+" Factorial is :"+fact);
		writer.println("</h3></div>");
		RequestDispatcher rd = req.getRequestDispatcher("index.html");
		rd.include(req, res);
		}
		else
		{
			writer.println("num cannot be less than 1");	
			writer.println("</h3></div>");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, res);
		}
		
		
	}

}
