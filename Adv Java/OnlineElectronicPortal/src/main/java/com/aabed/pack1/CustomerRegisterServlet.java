package com.aabed.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cusReg")
public class CustomerRegisterServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String addr = req.getParameter("addr");
		String mail = req.getParameter("mail");
		String mob = req.getParameter("mobile");
		
		CustomerBean cbean = new CustomerBean();
		cbean.setuName(uname);
		cbean.setuPass(pass);
		cbean.setfName(fname);
		cbean.setlName(lname);
		cbean.setAddr(addr);
		cbean.setMid(mail);
		cbean.setPhNo(mob);
		 
		int available = new CustomerLoginDAO().customerAvailable(cbean);
		if(available>0)
		{
			req.setAttribute("msg","User Already Registered Use Your login details" );
			req.getRequestDispatcher("relog.jsp").forward(req, res);
		}
		else
		{
		req.setAttribute("msg", "Customer Registered Successfully!!!");
		req.getRequestDispatcher("relog.jsp").forward(req, res);
		}
	}


}
