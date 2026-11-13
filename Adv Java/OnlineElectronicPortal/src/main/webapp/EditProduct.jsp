<%@page import="com.aabed.pack1.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!--  <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>


 /*  AdminBean abean = (AdminBean)session.getAttribute("abean");
   ProductBean pb=(ProductBean)request.getAttribute("p_bean");
   out.println(abean.getA_fname()+" below is the data which is availble to Edit<br><br>");*/


<form action="update" method="post">
Product Price <input type="text" name="pprice" value="=//pb.getPprice() %>"><br> <br>
Product Quantity <input type="text" name="pqty" value="//pb.getPqty() %>"> <br> <br>
<input type="hidden" name="pcode" value="<//pb.getPcode() %>"> <br> <br>
<input type="submit" value="Update">
</form>
</h1>

</body>
</html> -->


<%@page import="com.aabed.pack1.*"%>
<%
    AdminBean abean = (AdminBean) session.getAttribute("abean");
    ProductBean pb = (ProductBean) request.getAttribute("p_bean");

    if (abean == null) {
        response.sendRedirect("AdminLogin.html");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Product</title>

<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">
<link rel="stylesheet" href="editproduct.css">

</head>
<body>

<!-- Topbar -->
<div class="topbar">
    <h2>Edit Product</h2>

    <div class="actions">
        <a href="AdminHome.jsp" class="btn secondary">Dashboard</a>
        <a href="view1" class="btn primary">View Products</a>
        <a href="logout" class="btn danger">Logout</a>
    </div>
</div>

<div class="container">

    <div class="card">

        <h3 class="welcome">
            Hello Mr <%= abean.getA_fname() %> 👋
        </h3>

        <p class="subtitle">
            Update the product details below
        </p>

        <form action="update" method="post">

    <!-- Hidden Product Code -->
    <input type="hidden" name="pcode" value="<%= pb.getPcode() %>">

    <!-- Price -->
    <div class="input-group">
        <label>Product Price (₹)</label>
        <input type="number" name="pprice"
               value="<%= pb.getPprice() %>"
               required>
    </div>

    <!-- Quantity -->
    <div class="input-group">
        <label>Product Quantity</label>
        <input type="number" name="pqty"
               value="<%= pb.getPqty() %>"
               required>
    </div>

    <button type="submit" class="btn update-btn">
        Update Product
    </button>

</form>
    </div>

</div>

</body>
</html>