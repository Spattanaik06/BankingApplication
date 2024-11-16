<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.LoginBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	LoginBean lb=(LoginBean)session.getAttribute("lbean");
	out.println("Welcome to Our Bank ,"+lb.getAcountholder()+"<br>");
	%>
	<%@include file="loginsuccess.html" %>
</body>
</html>