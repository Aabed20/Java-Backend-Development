<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <%
 List<String> list = (List<String>) request.getAttribute("data"); 
 
 for(String value : list) {
	    out.println(value + "<br>");
 }
  %>

</body>
</html>