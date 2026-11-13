<%@page import="com.leave.Employee"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
       <%
       ArrayList<Employee> al=(ArrayList<Employee>)request.getAttribute("data");
       PrintWriter pw=response.getWriter();
       for(Employee e: al)
       {
    	   pw.println(e);
       }
       %>
</body>
</html>