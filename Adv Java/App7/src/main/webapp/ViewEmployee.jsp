<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Iterator" %>
<%@page import="java.util.ArrayList" %>    
<%@page import="com.pack1.EmpBean" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Data</title>
</head>
<body>

       <center>
       <h3>
       <u>Employee Details</u><br><br>
       <%
        ArrayList<EmpBean> al = (ArrayList<EmpBean>) request.getAttribute("list");
       
       if(al.size()==0)
       {
    	   out.println("Employee table is Empty");
       }
       else
       {
    	     Iterator<EmpBean> i=al.iterator();
    	     while(i.hasNext())
    	     {
    	    	 EmpBean eb = i.next();
    	    	 out.println(eb.getEmp_id()+" "+eb.getEmp_fname()+" "+eb.getEmp_lname()+" "+eb.getEmp_sal()+" "+eb.getEmp_addr()+"<br><br>");
    	     }
       }
       
       %>
       
       </h3>
       <jsp:include page="index.html"/>
</body>
</html>