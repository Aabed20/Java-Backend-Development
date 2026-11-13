package com.pack1;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		Cookie arr[] =req.getCookies();
		String user_name=null;
		
		if(arr==null)
		{
			req.setAttribute("msg", "Session Expired!!!");
			req.getRequestDispatcher("Register.jsp").forward(req, res);
			
		}
		else
		{
			ServletContext context = req.getServletContext();
			UserBean ub = (UserBean) context.getAttribute("userBean");
			
			ub.setFirstName(req.getParameter("fname"));
			ub.setLastName(req.getParameter("lname"));
			ub.setEmailId(req.getParameter("umail"));
			ub.setPhoneNumber(req.getParameter("phno"));
			
			int rowCount = new UpdateProfileDAO().updateProfile(ub);
			if(rowCount>0)
			{
			  req.setAttribute("msg", "Profile updated");	
			  for(Cookie c:arr)
			  {
				  if("ck1".equals(c.getName()))
				  {
					  user_name=c.getValue();
				  }
			  }
			  req.setAttribute("user_name",user_name);
			  req.getRequestDispatcher("UpdateProfile.jsp").forward(req, res);
			}
			else
			{
				throw new RuntimeException("Profile Not Updated!!!");
			}
		}
	}
}
