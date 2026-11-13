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
         String p_name=request.getParameter("pname");
      String p_id=request.getParameter("pid");
      String p_qty=request.getParameter("pqty");
      String p_price=request.getParameter("pprice");
      
      out.println("Product Name : "+p_name+"<br><br>");
      out.println("Product Id : "+p_id+"<br><br>");
      out.println("Product Quantity : "+p_qty+"<br><br>");
      out.println("Product Price : "+p_price+"<br><br>");
      %>
      </h1>

</body>
</html>