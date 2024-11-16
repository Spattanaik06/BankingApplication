<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
background-color:rgba(68, 35, 98, 0.423);
}
</style>
</head>
<body>
<%
String msg=(String)request.getAttribute("msg");
out.println(msg);
%>
<%@include file="loginsuccess.html" %>
</body>
</html>