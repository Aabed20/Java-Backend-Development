package com.calculation_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/pr")
public class Prime extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		int num = Integer.parseInt(req.getParameter("number").trim());
		
		PrintWriter writer = res.getWriter();
		res.setContentType("text/html");
		
		boolean isPrime=true;
		
		if(num<=1)
		{
			isPrime=false;
		}
		
		else
		{
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				isPrime = false;
		        break;
			}
		}
		}
		
		if(isPrime)
		{
		writer.println("<div style=\"display: flex; justify-content: center; align-items: center;\">"+"<h3>");
		writer.println(num+" is Prime Number.");
		
		writer.println("</h3></div>");
		RequestDispatcher rd = req.getRequestDispatcher("index.html");
		rd.include(req, res);
		
		
		}
		else
		{
			writer.println("<div style=\"display: flex; justify-content: center; align-items: center;\">"+"<h3>");
			writer.println(num+" is Not Prime Number.");
			
			writer.println("</h3></div>");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, res);
		}
		
	}

}
