package com.book_management;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddBook extends HttpServlet 
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		
	  int id =Integer.parseInt(req.getParameter("id"));
		String name= (String) req.getParameter("name");
		String author = (String) req.getParameter("author");
		String publisher = (String) req.getParameter("publisher");
		int price = Integer.parseInt(req.getParameter("price"));
		int quantity = Integer.parseInt(req.getParameter("quantity"));
		String category = (String) req.getAttribute("category");
		int isbn = Integer.parseInt(req.getParameter("isbn"));
		
		Book bk = new Book();
		
		bk.setBookid(id);
		bk.setBookName(name);
		bk.setAuthor(author);
		bk.setPublisher(publisher);
		bk.setPrice(price);
		bk.setCategory(category);
		bk.setQuantity(quantity);
		bk.setIsbn(isbn);
		
		DAO da = new DAO();
		int rows=da.addBook(bk);
		if(rows>0)
		{
			req.getRequestDispatcher("success.jsp").forward(req, res);
		}
		else
		{
			req.getRequestDispatcher("failed.jsp").forward(req, res);
		}
		
		
	}

}
