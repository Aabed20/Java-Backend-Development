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
        
        String msg=(String) request.getAttribute("msg");
        response.sendError(HttpServletResponse.SC_BAD_REQUEST,msg);
        %>
        <%=msg %> <br> <br>
        
        <a href="AddProduct.html" >Add Product</a>
        <a href="view1">View Products</a>
        <a href="logout">Logout</a>
         </h1>
        
        
        
        
</body>
</html>