package com.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterStudent extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String course = req.getParameter("course");
		String city = req.getParameter("city");
		
		StudentBean sb = new StudentBean();
		sb.setId(id);
		sb.setName(name);
		sb.setEmail(email);
		sb.setCourse(course);
		sb.setCity(city);
		
		StudentDAO sd = new StudentDAO();
	int rows= sd.registerStudent(sb);
		if(rows>0)
		{
			req.getRequestDispatcher("welcome.jsp").forward(req, res);;
		}
		else
		{
			req.getRequestDispatcher("index.html").forward(req, res);
		}
		
	}
}
