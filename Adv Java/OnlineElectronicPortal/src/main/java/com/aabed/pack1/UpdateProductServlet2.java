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

@WebServlet("/updateProduct")
public class UpdateProductServlet2 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		HttpSession session = req.getSession(false);
		if(session==null)
		{
			req.setAttribute("msg", "Session Expired Please Re-Login");
			req.getRequestDispatcher("relog.jsp").forward(req, res);
		}
		else
		{
			String reqQty =req.getParameter("reqqty");
			int rQty = Integer.parseInt(reqQty);
			
			String pqty = req.getParameter("pqty");
			int pQty = Integer.parseInt(pqty);
			String pcode = req.getParameter("pcode");
			ProductBean pb = null;
			if(pQty==0)
			{
				req.setAttribute("msg", "Product is not available yet");
				req.getRequestDispatcher("viewProduct2.jsp").forward(req, res);
			  return;
			}
			else if(rQty>pQty)
			{
				
				req.setAttribute("msg", "Required Quantity should be equal or less than to "+pQty);
				req.getRequestDispatcher("viewProduct2.jsp").forward(req, res);
			  return;
			}
			pqty = ""+(pQty-rQty);
			ArrayList<ProductBean> al = (ArrayList<ProductBean>)session.getAttribute("productList");
		
			for(int j=0; j<al.size(); j++)
			{
				pb = al.get(j);
				if(pb.getPcode().equals(pcode))
				{
					pb.setPqty(pqty);
					al.set(j, pb);
					break;
				}
				
			}
			  int updatedQty = new UpdateProductDAO().updateProductQuantity(pb);
			  if(updatedQty>0)
			  {
				  session.setAttribute("productList", al);
				  req.setAttribute("msg", "You have charged "+(Integer.parseInt(pb.getPprice())*rQty)+" Rs For "+rQty+" "+pb.getPname()+"<br><br>Your Order is placed successfully!!!");
				  req.getRequestDispatcher("OrderConfirmed.jsp").forward(req, res);
			  }
			  else
			  {
				  req.setAttribute("msg", "Order Placement Failed!!!");
				  req.getRequestDispatcher("viewProduct2.jsp").forward(req, res);
			  }
			
			
		}
	}

}
