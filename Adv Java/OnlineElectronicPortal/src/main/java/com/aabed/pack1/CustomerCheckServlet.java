package com.aabed.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/clog")
public class CustomerCheckServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		String val = req.getParameter("log");
		if(val.equalsIgnoreCase("login"))
		{
			CustomerBean cbean = new CustomerBean();
			cbean.setuName(req.getParameter("c_name"));
			cbean.setuPass(req.getParameter("c_pwd"));
			int rowCount = new CustomerLoginDAO().checkDetails(cbean);
			if(rowCount>0)
			{
				HttpSession session = req.getSession();
				session.setAttribute("abean", cbean);
				req.getRequestDispatcher("customerHome.jsp").forward(req, res);
			}
			else
			{
				req.setAttribute("msg", "Wrong user name & password!!!");
				req.getRequestDispatcher("relog.jsp").forward(req, res);
			}
		}
		else
		{
			req.getRequestDispatcher("CustomerRegister.html").forward(req, res);
			
		}
	}
}
