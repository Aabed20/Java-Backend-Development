package com.login_page;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/log")
public class LoginPage extends GenericServlet 
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
      String click = req.getParameter("btn");
      String userName = "Aabed";
      String password = "Aabed@123";
      PrintWriter writer = res.getWriter();
      res.setContentType("text/html");      
      if(click.equals("register"))
      {
    	  
	  
    	  RequestDispatcher rd = req.getRequestDispatcher("registration.html");
    	  rd.forward(req, res);
      }
      else if(click.equals("login"))
      {
    	  if(userName.equals(req.getParameter("user"))&&password.equals(req.getParameter("pass")))
    	  {
    		  writer.print("<h3><center>");
    		  writer.print(userName+" is Login successfully!!!");
    		  writer.print("</h3><center>");
    	  }
    	  else
    	  {
    		  writer.print("<h3><center>");
    		  writer.print("Wrong userName and Password!!!");
    		  writer.print("</h3><center>");  
    	  }
      }
      else
      { 
    	  writer.print("<h3><center>");
          writer.print("Invalid input");
	      writer.print("</h3><center>"); 
    	 
      }
	
	}

}
