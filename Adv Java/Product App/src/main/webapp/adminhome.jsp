<%@page import="com.aabed.products_servlet.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="adminhome.css">
</head>
<body>

    <div class="dashboard">
      
        <h1>Welcome User :  
        <%
          AdminBean ab =(AdminBean)request.getAttribute("data");
          String fname = ab.getFname();
          out.println("<span>"+fname+"</span>");
      %></h1>

        <div class="btn-group">
            <a href="addproducts.html" class="btn add">Add Product</a>
            <a href="viewproducts" class="btn view">View All Products</a>
            <a href="login.html" class="btn logout">Logout</a>
        </div>

    </div>

</body>
</html>