package com.login_page;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.GenericSignatureFormatError;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/reg")
public class Registered extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String result =req.getParameter("btn2");
		PrintWriter writer = res.getWriter();
	      res.setContentType("text/html");  
	      if(result.equals(("registered")))
    	  {
    		  writer.print("<h3><center>");
    		  writer.print("Registered successfully");
    		  writer.print("</h3><center>");
    	  }
    	  else
    	  {
    		  writer.print("<h3><center>");
    		  writer.print("Fill all the Fields");
    		  writer.print("</h3><center>");
    	  }
		
	}

}
