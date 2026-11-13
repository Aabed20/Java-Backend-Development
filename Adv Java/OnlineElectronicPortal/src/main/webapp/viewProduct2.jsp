
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
    <%/*
    CustomerBean cbean  =(CustomerBean) session.getAttribute("abean");
    String msg = (String) request.getAttribute("msg");
    ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("productList");
    if(msg!=null)
    {
    	out.println(msg+"<br><br>");
    }
    if(al.size()==0)
    {
 	   out.println("Products are NOT available in the Inventory");
    }
    else
    {
 	   out.println("Hello Mr "+cbean.getfName()+" these are the Products<br><br>");
 	   
 	    Iterator<ProductBean> i= al.iterator();
 	    while(i.hasNext())
 	    {
 	    	ProductBean pb =i.next();
 	    	out.println(pb.getPcode()+" "+pb.getPname()+" "+pb.getPcompany()+" "+pb.getPprice()+" "+pb.getPqty()+
 	    			"<a href='buy?pcode="+pb.getPcode()+"'>Buy</a>"+"<br><br>");
 	    } 
    }*/
    %>
    
    </h1>
</body>
</html> -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="com.aabed.pack1.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Available Products</title>

<style>
body {
    background: url("<%=request.getContextPath()%>/Images/img2.jpg") no-repeat center center fixed !important;
    background-size: cover !important;
}
</style>

<!-- Premium Fonts -->
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&family=Playfair+Display:wght@600&display=swap" rel="stylesheet">

<link rel="stylesheet" href="viewProducts2.css">
</head>

<body>

<%
CustomerBean cbean = (CustomerBean) session.getAttribute("abean");
String msg = (String) request.getAttribute("msg");
ArrayList<ProductBean> al = (ArrayList<ProductBean>) session.getAttribute("productList");
%>

<div class="container">

    <div class="card">

        <h2>Available Products</h2>
        <p class="welcome">Hello Mr <span><%= cbean.getfName() %></span></p>

        <% if(msg != null) { %>
            <div class="message"><%= msg %></div>
        <% } %>

        <% if(al == null || al.size() == 0) { %>
            <div class="no-products">
                Products are NOT available in the Inventory
            </div>
        <% } else { %>

        <table>
            <thead>
                <tr>
                    <th>Code</th>
                    <th>Name</th>
                    <th>Company</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Action</th>
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
                        <a href="buy?pcode=<%= pb.getPcode() %>" class="buy-btn">
                            Buy
                        </a>
                    </td>
                </tr>
                <% } %>
            </tbody>
        </table>

        <% } %>

        <div class="back-btn">
            <a href="logout">Logout</a>
        </div>

    </div>

</div>

</body>
</html>