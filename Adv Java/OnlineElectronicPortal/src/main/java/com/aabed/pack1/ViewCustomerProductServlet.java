package com.aabed.pack1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/view2")
public class ViewCustomerProductServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{

		HttpSession session = req.getSession(false);
		if(session==null)
		{
			req.setAttribute("msg", "Session expired please Re-Login!!!");
			req.getRequestDispatcher("relog.jsp");
		}
		else
		{
		  req.setAttribute("msg", null);
		   ArrayList<ProductBean> al = new ViewProductDAO().retrieveProducts();
		   session.setAttribute("productList", al);
		   req.getRequestDispatcher("viewProduct2.jsp").forward(req, res);
		}

	}

	
}
