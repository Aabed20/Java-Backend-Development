<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.pack1.*"%>
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
    UserBean ub=(UserBean)request.getAttribute("userBean");
      String uname = ub.getUsername();
      String pass = ub.getPassword();
      String encryptedpass = "****"+pass.substring(pass.length()-2);
      String fname= ub.getFname();
      String lname = ub.getLname();
      String mid = ub.getMail();
      String phno = ub.getPhno();
      out.println("Hello Welcome "+fname+"<br><br>");
      out.println("Here is you data <br><br>");
      out.println("Username : "+uname+"<br><br>");
      out.println("Password : "+encryptedpass+"<br><br>");
      out.println("First Name : "+fname+"<br><br>");
      out.println("Last Name : "+lname+"<br><br>");
      out.println("Mail id : "+mid+"<br><br>");
      out.println("Phone number : "+phno+"<br><br>");
      
  
  %>
  
  
  </h1>


</body>
</html>