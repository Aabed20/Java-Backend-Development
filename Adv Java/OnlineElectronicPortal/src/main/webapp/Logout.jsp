<%@page import="javax.xml.crypto.Data"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.aabed.pack1.*"%>
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
      Object obj = session.getAttribute("abean");
   String name = "";
   if(obj instanceof CustomerBean)
   {
	   CustomerBean data = (CustomerBean)obj;
	   name = "Customer";
   }
   else if(obj instanceof AdminBean)
   {
	   AdminBean data = (AdminBean) obj;
	   name = "Admin";
   }
     out.println(name+" Logout Successfully!!!");
   session.invalidate();
   %>
   </h1>
   <%@ include file="index.html" %>
</body>
</html>