<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     
     <center>
     <h1>
     <% pageContext.setAttribute("fName","Java is Awesome!!"); %>
     <c:set var="name" value="${param.uname}"/>
     WELCOME : <c:out value="${name}"/> <br> <br>
     <c:set var="a" value="${applicationScope.a}"/>
     <c:set var="b" value="${sessionScope.b}"/>
     <c:set var="c" value="${requestScope.c}"/>
     <c:set var="d" value="${pageScope.fName}"/>
     
     Context Value : <c:out value="${a}"/> <br> <br>
     Session Value : <c:out value="${b}"/> <br> <br>
     Request Value : <c:out value="${c}"/> <br> <br>
     Page Value : <c:out value="${d}"/> <br> <br>
     </h1>
</body>
</html>