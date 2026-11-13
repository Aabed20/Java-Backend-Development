package com.aabed;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		AdminBean ab = new AdminDAO().login(req);
		if(ab!=null)
		{
			req.getRequestDispatcher("loginsuccess.jsp").forward(req, res);
		}
		else
		{
			req.getRequestDispatcher("loginfailed.html").forward(req, res);
		}
	}

}
