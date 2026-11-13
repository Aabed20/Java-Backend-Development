package com.aabed;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String aName =req.getParameter("aname");
		String pass = req.getParameter("apass");
		String fName = req.getParameter("afname");
		String lName = req.getParameter("alname");
		String mail = req.getParameter("amail");
		String phno = req.getParameter("aphone");
		
		
		AdminBean ab = new AdminBean();
		
		ab.setAdminName(aName);
		ab.setAdminFirstName(fName);
		ab.setAdminLastName(lName);
		ab.setAdminMail(mail);
		ab.setAdminPhone(phno);
		ab.setAdminPass(pass);
		
		AdminDAO ad = new AdminDAO();
		int rows=ad.reg(ab);
		
		if(rows>0)
		{
		req.getRequestDispatcher("registered.html").forward(req, res);	
		}
		else
		{
			req.getRequestDispatcher("notregistered.html").forward(req, res);
		}
		
		
	}
	
	
}
