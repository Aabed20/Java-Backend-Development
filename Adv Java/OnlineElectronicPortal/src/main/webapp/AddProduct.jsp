<%@page import="com.aabed.pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
     <%
   //  AdminBean abean=(AdminBean)session.getAttribute("abean");
    //String data= (String)request.getAttribute("msg");
     //out.println(data+" Mr. "+abean.getA_fname()+" <br><br>");
     %>
     <a  href="AddProduct.html">Add Products</a> <br> <br>
     <a href="view1">View Products</a> <br> <br>
     <a href="logout">Logout</a> <br> <br>
     </h1>

</body>
</html>
-->
<%@page import="com.aabed.pack1.AdminBean"%>
<%
    AdminBean abean = (AdminBean) session.getAttribute("abean");

    if(abean == null){
        response.sendRedirect("AdminLogin.html");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>

<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">
<link rel="stylesheet" href="addpro2.css">

</head>
<body>

<div class="page">

    <!-- Top Bar -->
    <div class="topbar">
    <h2>Welcome, <%= abean.getA_fname() %> 👋</h2>

    <div class="top-actions">
        <a href="AdminHome.jsp" class="back-btn">← Dashboard</a>
        <a href="logout" class="logout-btn">Logout</a>
    </div>
</div>

    <!-- Form Card -->
    <div class="form-container">

        <div class="form-card">
            <h3>Add New Product</h3>

            <form action="aps" method="post">

                <div class="input-box">
                    <input type="text" name="pcode" required>
                    <label>Product Code</label>
                </div>

                <div class="input-box">
                    <input type="text" name="pname" required>
                    <label>Product Name</label>
                </div>

                <div class="input-box">
                    <input type="text" name="pcomp" required>
                    <label>Product Company</label>
                </div>

                <div class="row">
                    <div class="input-box">
                        <input type="number" name="pprice" required>
                        <label>Price</label>
                    </div>

                    <div class="input-box">
                        <input type="number" name="pqty" required>
                        <label>Quantity</label>
                    </div>
                </div>

                <button type="submit" class="btn">Add Product</button>

            </form>
        </div>

    </div>

</div>

</body>
</html>