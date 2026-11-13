package com.aabed.products_servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addprod")
public class ProductAddServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		ProductBean pro = new ProductBean();
		pro.setProduct_id(req.getParameter("pcode"));
		pro.setProduct_name(req.getParameter("pname"));
		pro.setProduct_price(Double.parseDouble(req.getParameter("pprice")));
		pro.setProduct_qty(Integer.parseInt(req.getParameter("pstock")));
		
		int rows = InsertProductData.insertData(pro);
		
		if(rows>0)
		{
			req.setAttribute("msg", "Product Inserted Successfully!!!");
			req.getRequestDispatcher("insertedproduct.jsp").forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "Product Not Inserted!!!");
			req.getRequestDispatcher("addproducts.jsp").forward(req, res);	
		}
	}

	
}
