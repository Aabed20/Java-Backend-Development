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
  String name = (String)request.getParameter("uname");
String filterName =(String) request.getAttribute("FilterName");
String msg = (String)request.getAttribute("msg");

out.println("Welcome : "+name+"<br><br>");
out.println("Filter Name : "+filterName+"<br><br>");
out.println("FilterConfig Data from web.xml : "+msg);
  
  %>
  
  
  </h1>
</body>
</html>