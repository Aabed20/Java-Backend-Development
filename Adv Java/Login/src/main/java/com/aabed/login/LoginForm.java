package com.aabed.login;

import java.awt.print.PrinterAbortException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/login")
public class LoginForm extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		int id = Integer.parseInt(req.getParameter("id").trim());
		String fName = req.getParameter("fname");
		String lName = req.getParameter("lname");
		String emailId = req.getParameter("email");
		long phoneNumber = Long.parseLong(req.getParameter("phNo"));
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		 pw.println("Form Submitted successfully...");
		 pw.println("UserId : "+id+"<br><br>");
		 pw.println("User Fname : "+fName+"<br><br>");
		 pw.println("User LName : "+lName+"<br><br>");
		 pw.println("User MailId : "+emailId+"<br><br>");
		 pw.println("User PhNo : "+phoneNumber+"<br><br>");
		 
		 
		
	}

}
