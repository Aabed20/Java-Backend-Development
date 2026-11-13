<%@page import="java.io.PrintWriter"%>
<%@page import="com.pack1.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <% 
      StudentBean sb=(StudentBean)request.getAttribute("data");
      PrintWriter pw=response.getWriter();
      
      pw.print("<center>Student ID : "+sb.getId()+"<br><br>");
      pw.print("Student Name : "+sb.getName()+"<br><br>");
      pw.print("Student Email : "+sb.getEmail()+"<br><br>");
      pw.print("Student Course : "+sb.getCourse()+"<br><br>");
      pw.print("Student City : "+sb.getCity());
      
    %>
</body>
</html>