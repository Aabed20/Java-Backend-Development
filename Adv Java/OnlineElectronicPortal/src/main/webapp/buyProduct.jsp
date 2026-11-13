
<!--  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<center>
<h1>
<%/*
CustomerBean abean = (CustomerBean)session.getAttribute("abean");
String msg = (String) request.getAttribute("msg");
if(msg!=null)
{
   out.println(msg+"<br><br>");
}
out.println("How much quantity you want to buy Mr "+abean.getfName()+"<br><br>");

ProductBean pb=(ProductBean)request.getAttribute("p_bean");
*/
%></h1>
<form action="updateProduct" method="post"><h1>
Product Code <input type="text" name="pcode" value="%=pb.getPcode()%>" readonly="readonly"><br> <br>
Product Name <input type="text" name="pname" value="%=pb.getPname()%>" readonly="readonly"><br> <br>
Product Company <input type="text" name="pcompany" value="%=pb.getPcompany()%>" readonly="readonly"><br> <br>
Product Price <input type="text" name="pprice" value="%=pb.getPprice() %>" readonly="readonly"><br> <br>
Product Quantity <input type="text" name="pqty" value="%=pb.getPqty() %>" readonly="readonly"> <br> <br>
Required Quantity <input type="text" name="reqqty" > <br> <br>
<input type="hidden" name="pcode" value="%=pb.getPcode() %>"> <br> <br>
<input type="submit" value="Buy">
</h1>
</form>

</body>
</html>
-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.aabed.pack1.*"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Buy Product</title>

<!-- Premium Fonts -->
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&family=Playfair+Display:wght@600&display=swap" rel="stylesheet">

<link rel="stylesheet" href="buyProduct.css">
</head>
<body>

<%
CustomerBean abean = (CustomerBean)session.getAttribute("abean");
String msg = (String) request.getAttribute("msg");
ProductBean pb = (ProductBean)request.getAttribute("p_bean");
%>

<div class="container">

    <div class="card">

        <h2>Buy Product</h2>
        <p class="welcome">
            How much quantity you want to buy, 
            <span>Mr <%= abean.getfName() %></span>?
        </p>

        <% if(msg != null) { %>
            <div class="message"><%= msg %></div>
        <% } %>

        <form action="updateProduct" method="post">

            <div class="form-group">
                <label>Product Code</label>
                <input type="text" name="pcode" 
                       value="<%=pb.getPcode()%>" readonly>
            </div>

            <div class="form-group">
                <label>Product Name</label>
                <input type="text" 
                       value="<%=pb.getPname()%>" readonly>
            </div>

            <div class="form-group">
                <label>Company</label>
                <input type="text" 
                       value="<%=pb.getPcompany()%>" readonly>
            </div>

            <div class="form-group">
                <label>Price</label>
                <input type="text" 
                       value="₹ <%=pb.getPprice()%>" readonly>
            </div>

            <div class="form-group">
                <label>Available Quantity</label>
                <input type="text" name="pqty" value="<%=pb.getPqty()%>" readonly>
            </div>

            <div class="form-group highlight">
                <label>Required Quantity</label>
                <input type="number" name="reqqty" 
                       min="1" required 
                       placeholder="Enter quantity to buy">
            </div>

            <input type="hidden" name="pcode" value="<%=pb.getPcode()%>">

            <button type="submit" class="btn">Buy Now</button>
            <div class="button-group">
    

    <a href="view2" class="btn secondary">
        Back to Products
    </a>
</div>

        </form>

    </div>

</div>

</body>
</html>