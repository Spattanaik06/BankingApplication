<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
BankBean bankBean=(BankBean)session.getAttribute("bbean");
out.println("Enter the Amount u want to deposit ,"+bankBean.getUname()+"<br>");
%>
<form action="depositamount" method="post">
<input type="text" name="amount" placeholder="Enter Amount">
<button type="submit">Deposit</button>

</form>
</body>
</html>