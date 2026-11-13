<%@page import="com.aabed.pack1.AdminBean"%>
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
 
  /*
 AdminBean abean = (AdminBean)session.getAttribute("abean");
 String data = (String) request.getAttribute("msg");
 out.println("Hello "+abean.getA_fname()+"<br><br>");
 out.println(data+"<br><br>");
 */
 %>
 <a  href="AddProduct.html">Add Products</a> <br> <br>
     <a href="view1">View Products</a> <br> <br>
     <a href="logout">Logout</a> <br> <br>
 
 </h1>

</body>
</html> -->

<%@page import="com.aabed.pack1.AdminBean"%>
<%
    AdminBean abean = (AdminBean) session.getAttribute("abean");
    String data = (String) request.getAttribute("msg");

    if (abean == null) {
        response.sendRedirect("AdminLogin.html");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Status</title>

<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">
<link rel="stylesheet" href="updateProduct.css">

</head>
<body>

<!-- Top Navbar -->
<div class="topbar">
    <h2>Inventory System</h2>

    <div class="actions">
        <a href="AdminHome.jsp" class="btn secondary">Dashboard</a>
        <a href="AddProduct.jsp" class="btn add-nav">+ Add Product</a>
        <a href="view1" class="btn primary">View Products</a>
        <a href="logout" class="btn danger">Logout</a>
    </div>
</div>

<div class="container">

    <div class="status-card">

        <h3>Hello Mr <%= abean.getA_fname() %> 👋</h3>

        <div class="message-box">
            <p><%= data %></p>
        </div>

    </div>

</div>

</body>
</html>