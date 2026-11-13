
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
 
/* CustomerBean cbean = (CustomerBean) session.getAttribute("abean");
String msg = (String) request.getAttribute("msg");

   out.println("Hello "+cbean.getfName());
   out.println(msg); */
%>      
<a href="view2">View Products</a> <br> <br>
       <a href="logout">Logout</a> <br> <br>
       </h1>

</body>
</html>
-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.aabed.pack1.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Customer Notification</title>

<!-- Premium Fonts -->
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&family=Playfair+Display:wght@600&display=swap" rel="stylesheet">

<link rel="stylesheet" href="customerAction.css">
</head>

<body>

<%
CustomerBean cbean = (CustomerBean) session.getAttribute("abean");
String msg = (String) request.getAttribute("msg");
%>

<div class="container">

    <div class="card">

        <h2>Welcome, <span><%= cbean.getfName() %></span></h2>

        <% if(msg != null) { %>
            <div class="message">
                <%= msg %>
            </div>
        <% } %>

        <div class="button-group">
            <a href="view2" class="btn primary">View Products</a>
            <a href="logout" class="btn secondary">Logout</a>
        </div>

    </div>

</div>

</body>
</html>