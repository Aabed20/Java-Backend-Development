package com.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class UserRegistrationServlet extends HttpServlet
{
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
   {
	   UserBean ub = new UserBean();
	    ub.setUserName(req.getParameter("uname"));
	  ub.setPassword(req.getParameter("upwd"));
	    ub.setFirstName(req.getParameter("fname"));
	    ub.setLastName(req.getParameter("lname"));
	   ub.setEmailId(req.getParameter("umail"));
	   ub.setPhoneNumber(req.getParameter("phno"));
	   
	   UserRegisterDAO obj = new UserRegisterDAO();
	   int rows=obj.insertData(ub);
	   if(rows>0)
	   {
		   req.setAttribute("msg", "User registered Succesfully");
		   req.getRequestDispatcher("Register.jsp").forward(req, res);
	   }
	   else
	   {
		   req.setAttribute("msg", "Registeration Failed!!");
		   req.getRequestDispatcher("Register.jsp").forward(req, res);
	   }
	   
	   
   }
}
