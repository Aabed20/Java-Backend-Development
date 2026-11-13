package com.aabed.pack1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/aps")
public class AddProductServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		try
		{
			
			HttpSession session = req.getSession(false);
			if(session==null)
			{
				throw new RuntimeException("Session Expired!!!");
			}
			else
			{
				ProductBean pb = new ProductBean();
				pb.setPcode(req.getParameter("pcode"));
				pb.setPname(req.getParameter("pname"));
				pb.setPcompany(req.getParameter("pcomp"));
				pb.setPprice(req.getParameter("pprice"));
				pb.setPqty(req.getParameter("pqty"));
				
				
				int rowCount = new AddProductDAO().insertProduct(pb);
		         if(rowCount>0)
		         {
		        	    req.setAttribute("msg", "Products Inserted Successfully");
		        	    req.getRequestDispatcher("AddProduct.jsp").forward(req, res);
		         }
				
		         else
		         {
		        //	 throw new RuntimeException("Product insertion failed");
		         }
			}
		}
		catch(Exception e)
		{
		   req.setAttribute("msg", "Duplicate Product Ids are Not allowed");
		   req.getRequestDispatcher("Error.jsp").forward(req, res);
		}
		
	}

}
