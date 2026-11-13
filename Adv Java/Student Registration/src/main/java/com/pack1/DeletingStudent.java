package com.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeletingStudent extends HttpServlet
{

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String id=req.getParameter("id");
		
		StudentDAO sd = new StudentDAO();
		int rows=sd.deleteStudent(id);
		if(rows>0)
		{
			req.getRequestDispatcher("deleted.jsp").forward(req, res);
		}
		else
		{
			req.getRequestDispatcher("index.html").forward(req, res);
		}
		
	}
	
	
}
