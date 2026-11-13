<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.aabed.pack1.*"%>
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
        // CustomerBean cbean  =(CustomerBean) session.getAttribute("abean");
          //out.println(" Welcome "+cbean.getfName()+" to Online Electronics Portal Website <br><br>");
       %>
       <a href="view2">View Products</a> <br> <br>
       <a href="logout">Logout</a> <br> <br>
       </h1>
</body>
</html>
-->

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Customer Dashboard</title>
<style>
body {
    min-height: 100vh;
    font-family: 'Poppins', sans-serif;
    background: url("<%=request.getContextPath()%>/Images/img1.jpg") no-repeat center center;
    background-size: cover;
}
</style>

<!-- Premium Fonts -->
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&family=Playfair+Display:wght@600&display=swap" rel="stylesheet">

<link rel="stylesheet" href="customerHome.css">
</head>

<body>

<%
   CustomerBean cbean = (CustomerBean) session.getAttribute("abean");
   String name = cbean.getfName();
%>

<div class="dashboard-container">

    <div class="dashboard-card">
        <h2>Welcome, <span><%= name %></span></h2>
        <p class="subtitle">Online Electronics Portal</p>

        <div class="btn-group">
            <a href="view2" class="btn primary">View Products</a>
            <a href="logout" class="btn secondary">Logout</a>
        </div>
    </div>

</div>

</body>
</html>