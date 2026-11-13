package com.pack1;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/dis")
public class DisplayFilter implements Filter
{
  public FilterConfig fcg = null;
  
  @Override
  public void init(FilterConfig fcg)
  {
	  this.fcg=fcg;
  }
  
  
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc)
			throws IOException, ServletException
	{
		req.setAttribute("FilterName", fcg.getFilterName());
			req.setAttribute("msg", fcg.getInitParameter("msg"));
			req.getRequestDispatcher("Display.jsp").forward(req, res);
			
	}

}
