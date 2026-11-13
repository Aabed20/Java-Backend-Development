<%@page import="com.pack1.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
      UserBean ub = (UserBean) application.getAttribute("userBean");
      String data = (String)request.getAttribute("msg");
      out.println("This Session belongs to "+ub.getUserName()+"<br><br>");
      out.println(data+"<br><br>");
      
      %>
      <a href="view">View Profile</a>
      <a href="logout">Logout</a>
      </h1>
</body>
</html>