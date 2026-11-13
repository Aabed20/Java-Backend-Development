
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
 //  String data=(String)request.getAttribute("msg");
   //out.println(data+"<br><br>");
%>
</h1>
<jsp:include page="CustomerLogin.html"/>

</body>
</html> -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Message</title>

<!-- Premium Fonts -->
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&family=Playfair+Display:wght@600&display=swap" rel="stylesheet">

<link rel="stylesheet" href="messagePage.css">
</head>

<body>

<%
String data = (String) request.getAttribute("msg");
%>

<div class="container">

    <div class="card">

        <h2>Notification</h2>

        <% if(data != null) { %>
            <div class="message">
                <%= data %>
            </div>
        <% } %>

        <div class="login-section">
            <jsp:include page="CustomerLogin.html"/>
        </div>

    </div>

</div>

</body>
</html>