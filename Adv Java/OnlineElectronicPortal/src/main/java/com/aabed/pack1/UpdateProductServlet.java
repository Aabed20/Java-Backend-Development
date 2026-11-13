package com.aabed.pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/update")
public class UpdateProductServlet extends HttpServlet 
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		HttpSession session = req.getSession(false);
		if(session==null)
		{
			throw new RuntimeException("Session Expired!!!");
		}
		else
		{
			String pprice=req.getParameter("pprice");
			String pqty = req.getParameter("pqty");
			String pcode = req.getParameter("pcode");
			ArrayList<ProductBean> al = (ArrayList<ProductBean>)session.getAttribute("productList");
			Iterator<ProductBean> i = al.iterator();
			ProductBean pb = null;
			while(i.hasNext())
			{
				pb = i.next();
				if(pcode.equals(pb.getPcode()))
				{
					break;
				}
			}
			pb.setPprice(pprice);
			pb.setPqty(pqty);
			
			int rowCount = new UpdateProductDAO().updateProduct(pb);
			if(rowCount>0)
			{ 
				req.setAttribute("msg", "Product Inventory Updated Successfully");
				req.getRequestDispatcher("UpdateProduct.jsp").forward(req, res);
			}
		else
		{
			req.setAttribute("msg", "Product Inventory Updation FAILED!!!");
			req.getRequestDispatcher("UpdateProduct.jsp").forward(req, res);
					
		}
			
		}
		
	}
}
