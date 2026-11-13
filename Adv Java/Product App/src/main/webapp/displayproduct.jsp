<%@ page import="java.util.*" %>
<%@page import="com.aabed.products_servlet.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="product.css">
</head>
<body>
        <table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Quantity</th>   
    </tr>

<%
TreeSet<ProductBean> data = (TreeSet<ProductBean>)request.getAttribute("productList");

for(ProductBean p : data){
%>
    <tr>
        <td><%= p.getProduct_id() %></td>
        <td><%= p.getProduct_name() %></td>
        <td><%= p.getProduct_price() %></td>
        <td><%= p.getProduct_qty() %></td>   
    </tr>
<%
}
%>

</table>
</body>
</html>