package com.aabed.products_servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.TreeSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewproducts")
public class DisplayProductServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
	
		try
		{
			Connection con = DBConnect.getCon();
			PreparedStatement pstat = con.prepareStatement("select * from products");
			ResultSet rs = pstat.executeQuery();
			TreeSet<ProductBean> set = new TreeSet<ProductBean>((p1,p2)->p1.getProduct_id().compareTo(p2.getProduct_id()));
			//ArrayList<ProductBean> list = new ArrayList<>();
			while(rs.next())
			{
			ProductBean pb =	new ProductBean();
			pb.setProduct_id(rs.getString(1));
			pb.setProduct_name(rs.getString(2));
			pb.setProduct_price(rs.getDouble(3));
			pb.setProduct_qty(rs.getInt(4));
			set.add(pb);
			}
			
			if(set.isEmpty())
			{
				req.setAttribute("msg", "No products available Add Product");
				req.getRequestDispatcher("insertedproduct.jsp").forward(req, res);
			}
			else
			{
				req.setAttribute("productList", set);
			    req.getRequestDispatcher("displayproduct.jsp").forward(req, res);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
