package com.pack1;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dis")
public class DisplayServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
		String name = req.getParameter("tname");
		String age = req.getParameter("tage");
		String gender = req.getParameter("gen");
		String address = req.getParameter("taddress");
		String mar_status = req.getParameter("ms");
		String qual = req.getParameter("qlfy");
		String courses = req.getParameter("crs");
		String hobbies = req.getParameter("hb");
		List<String> al = List.of(name,age,gender,address,mar_status,qual,courses);
		req.setAttribute("data", al);
		req.getRequestDispatcher("display.jsp").forward(req, res);
	}

}
