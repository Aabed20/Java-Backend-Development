<%@page import="java.util.*"%>
<%@page import="com.aabed.pack1.AdminBean"%>
<%@page import="com.aabed.pack1.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<center>
<h1>
   <%
  /* AdminBean abean = (AdminBean)session.getAttribute("abean");
   ArrayList<ProductBean> al =(ArrayList<ProductBean>)session.getAttribute("productList");
   
   if(al.size()==0)
   {
	   out.println("Products are NOT available in the Inventory");
   }
   else
   {
	   out.println("Hello Mr "+abean.getA_fname()+" these are you Products<br><br>");
	   
	    Iterator<ProductBean> i= al.iterator();
	    while(i.hasNext())
	    {
	    	ProductBean pb =i.next();
	    	out.println(pb.getPcode()+" "+pb.getPname()+" "+pb.getPcompany()+" "+pb.getPprice()+" "+pb.getPqty()+
	    			"<a href='edit?pcode="+pb.getPcode()+"'>Edit</a>"+" "
	    			+"<a href='delete?pcode="+pb.getPcode()+"'>Delete</a>"+"<br><br>");
	    } 
   }*/
   %>
</h1>
</body>
</html> -->

<%@page import="java.util.*"%>
<%@page import="com.aabed.pack1.AdminBean"%>
<%@page import="com.aabed.pack1.ProductBean"%>
<%
    AdminBean abean = (AdminBean) session.getAttribute("abean");
    ArrayList<ProductBean> al =
        (ArrayList<ProductBean>) session.getAttribute("productList");

    if(abean == null){
        response.sendRedirect("AdminLogin.html");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Products</title>

<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">
<link rel="stylesheet" href="ViewProducts.css">

</head>
<body>

<!-- Topbar -->
<div class="topbar">
    <h2>Product Inventory</h2>
    <div class="top-actions">
        <a href="AdminHome.jsp" class="btn secondary">Dashboard</a>
        <a href="AddProduct.jsp" class="btn primary">+ Add Product</a>
        <a href="logout" class="btn danger">Logout</a>
    </div>
</div>

<div class="container">

<% if(al == null || al.size() == 0) { %>

    <div class="empty">
        <h3>No Products Available</h3>
        <p>Inventory is currently empty.</p>
    </div>

<% } else { %>

    <h3 class="welcome">
        Hello Mr <%= abean.getA_fname() %> 👋
    </h3>

    <div class="table-wrapper">
        <table>
            <thead>
                <tr>
                    <th>Code</th>
                    <th>Name</th>
                    <th>Company</th>
                    <th>Price</th>
                    <th>Qty</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>

            <% for(ProductBean pb : al) { %>

                <tr>
                    <td><%= pb.getPcode() %></td>
                    <td><%= pb.getPname() %></td>
                    <td><%= pb.getPcompany() %></td>
                    <td>₹ <%= pb.getPprice() %></td>
                    <td><%= pb.getPqty() %></td>
                    <td>
                        <a href="edit?pcode=<%= pb.getPcode() %>" class="btn small edit">Edit</a>
                        <a href="delete?pcode=<%= pb.getPcode() %>" class="btn small delete">Delete</a>
                    </td>
                </tr>

            <% } %>

            </tbody>
        </table>
    </div>

<% } %>

</div>

</body>
</html>