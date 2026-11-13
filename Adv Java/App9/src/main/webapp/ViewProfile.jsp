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
     String uname =(String)request.getAttribute("user_name");
     UserBean ub = (UserBean) application.getAttribute("userBean");
     
     out.println("This Session belongs to "+uname+"<br><br>");
     out.println("<u>Profile Details</u><br><br>");
     String pwd = ub.getPassword();
     String encrypPass = pwd.substring(0,1)+"*****"+pwd.substring(pwd.length()-1);
     
     out.println(ub.getUserName()+" "+encrypPass+" "+ub.getFirstName()+" "+ub.getLastName()+" "+ub.getEmailId()+" "+ub.getPhoneNumber()+"<br><br>");
     
   
   %>
   <a href="edit">Edit Profile</a><br><br>
   
   <a href="logout">Logout</a><br><br>
   </h1>
</body>
</html>