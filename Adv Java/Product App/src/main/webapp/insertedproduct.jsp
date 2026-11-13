<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
  h2 {
	color: white;
	font-weight: bolder;
}
</style>
<meta charset="UTF-8">
<title>Product insertion Page</title>
</head>
<body>
       <center>
       <h2>
         <%
         String msg=(String)request.getAttribute("msg");
         out.println(msg+"<br><br>");
         
         %>
       </h2>
       <jsp:include page="addproducts.html"></jsp:include>
</body>
</html>