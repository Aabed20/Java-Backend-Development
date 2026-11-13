package com.calculation_demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/cal")
public class Calculation extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		String cal =req.getParameter("option");
		
		if(cal.equals("Prime"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("/pr");
			rd.forward(req, res);
		}
		else if(cal.equals("Factor"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("/fr");
			rd.forward(req, res);
		}
		else if(cal.equals("Factorial"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("/ftr");
			rd.forward(req, res);
		}
		else if(cal.equals("Square"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("/sq");
			rd.forward(req, res);
		}
		else
		{
		   System.err.println("Not clicked on any button");
		}
		
	}

}
