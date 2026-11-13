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
<h2>
     <%
         String msg =(String)request.getAttribute("data");
          out.println("<span>"+msg+"</span><br><br><br>");
      %></h2>
      <jsp:include page="admin.html"></jsp:include>
</body>
</html>