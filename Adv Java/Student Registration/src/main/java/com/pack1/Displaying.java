package com.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class Displaying extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String id = req.getParameter("id");
		
		StudentDAO sd = new StudentDAO();
		StudentBean sb=sd.getStudentById(id);
		{
			if(sb!=null)
			{
				req.setAttribute("data", sb);
				req.getRequestDispatcher("Display.jsp").forward(req, res);
			}
			else
			{
				req.getRequestDispatcher("index.html").forward(req, res);
			}
		}
	}
}
