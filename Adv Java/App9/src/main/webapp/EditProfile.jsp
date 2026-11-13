<%@page import="com.pack1.UserBean"%>
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
      UserBean ub = (UserBean) application.getAttribute("userBean");
      String uname = (String)request.getAttribute("user_name");
      out.println("This Session belongs to "+uname+"<br><br>");
      out.println("<u>Edit Profile </u><br><br>");
      %>
      <form action="update" method="post">
      FirstName <input type="text" name="fname" value="<%= ub.getFirstName() %>"> <br><br>
      LastName <input type="text" name="lname" value="<%= ub.getLastName() %>"> <br><br>
      EmailId <input type="text" name="umail" value="<%= ub.getEmailId() %>"> <br><br>
      Phone No <input type="text" name="phno" value="<%= ub.getPhoneNumber() %>"> <br><br>
      <input type="submit" value="update">
      </form>
      </h1>
</body>
</html>