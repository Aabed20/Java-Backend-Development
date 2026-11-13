package com.calculation_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fr")
public class Factor extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		int num = Integer.parseInt(req.getParameter("number").trim());
		
		PrintWriter writer = res.getWriter();
		res.setContentType("text/html");
		
		writer.println("<div style=\"display: flex; justify-content: center; align-items: center;\"><h3>");
		
		
		if(num>=1)
		{
			writer.println(num+" Factors are :<br><br>");
			for(int i=1; i<=num/2; i++)
		
		{
			if(num%i==0)
			{
				writer.println(i+" ");
			}
		}
		writer.println(num+"</h3></div>");
		RequestDispatcher rd = req.getRequestDispatcher("index.html");
		rd.include(req, res);
		}
		else
		{
			writer.print("Number cannot be 0 or less than 0");
			writer.println("</h3></div>");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, res);
		}
	}

}
