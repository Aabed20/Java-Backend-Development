package com.aabed.products_servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		AdminBean admin = AdminValidation.validate(req.getParameter("uname"), req.getParameter("pass"));
		if(admin!=null)
		{
		req.setAttribute("data", admin);
		req.getRequestDispatcher("adminhome.jsp").forward(req, res);
		}
		else
		{
			req.setAttribute("data", "Invali Login Credentials!!!");
			req.getRequestDispatcher("loginfailed.jsp").forward(req, res);
		}
	}

}
