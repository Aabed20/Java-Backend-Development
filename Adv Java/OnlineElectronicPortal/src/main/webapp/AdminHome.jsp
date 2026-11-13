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
     <a  href="AddProduct.html">Add Products</a> <br> <br>
     <a href="view1">View Products</a> <br> <br>
     <a href="logout">Logout</a> <br> <br>
     </h1>
</body>
</html> -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>Admin Dashboard</title>

<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">

<link rel="stylesheet" href="dashboard.css">
</head>

<body>

<div class="layout">

    <!-- Sidebar -->
    <aside class="sidebar" id="sidebar">
        <div class="logo">
            ⚡ Admin
            <button id="toggleBtn"><i class="fa fa-bars"></i></button>
        </div>

        <ul>
            <li class="active">
                <a href="#"><i class="fa fa-home"></i> <span>Dashboard</span></a>
            </li>

            <li>
                <a href="AddProduct.html">
                    <i class="fa fa-plus"></i> <span>Add Product</span>
                </a>
            </li>

            <li>
                <a href="view1">
                    <i class="fa fa-box"></i> <span>View Products</span>
                </a>
            </li>

            <li>
                <a href="logout">
                    <i class="fa fa-sign-out-alt"></i> <span>Logout</span>
                </a>
            </li>
        </ul>
    </aside>

    <!-- Main Content -->
    <main class="main">

        <!-- Topbar -->
        <div class="topbar">
            <h2>Welcome <%= abean.getA_fname() %> 👋</h2>

            <button id="modeToggle">
                <i class="fa fa-moon"></i>
            </button>
        </div>

        <!-- Dashboard Cards -->
        <div class="cards">

    <!-- Add Product Card -->
    <a href="AddProduct.html" class="card-link">
        <div class="card glass">
            <i class="fa fa-plus"></i>
            <h3>Add Products</h3>
            <p>Insert new products into system</p>
        </div>
    </a>

    <!-- View Products Card -->
    <a href="view1" class="card-link">
        <div class="card glass">
            <i class="fa fa-list"></i>
            <h3>View Products</h3>
            <p>Check all available products</p>
        </div>
    </a>

    <!-- Logout Card -->
    <a href="logout" class="card-link">
        <div class="card glass">
            <i class="fa fa-sign-out-alt"></i>
            <h3>Logout</h3>
            <p>Securely exit admin panel</p>
        </div>
    </a>



            <div class="card glass">
                <i class="fa fa-user-shield"></i>
                <h3>Admin Panel</h3>
                <p>Secure management access</p>
            </div>

        </div></div>

    </main>

</div>

<script>
    // Sidebar Toggle
    document.getElementById("toggleBtn").onclick = function () {
        document.getElementById("sidebar").classList.toggle("collapsed");
    };

    // Dark Mode Toggle
    document.getElementById("modeToggle").onclick = function () {
        document.body.classList.toggle("dark");
    };
</script>

</body>
</html>