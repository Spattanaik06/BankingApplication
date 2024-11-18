<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Details</title>
</head>
<body>
<%
BankBean bankBean1=(BankBean)session.getAttribute("bbean");

%>
<table>
    <tr>
        <th>
            ACCOUNT NO 
        </th>
        <th>
            USERNAME
        </th>
        <th>
            PASSWORD
        </th>
        <th>
            AMOUNT
        </th>
        <th>
            ADDRESS
        </th>
        <th>
            PHONE
        </th>
    </tr>
    <tr>
        <td> <%=bankBean1.getAccno() %> </td>
        <td> <%=bankBean1.getUname() %> </td>
        <td> <%=bankBean1.getPassword() %></td>
        <td> <%=bankBean1.getAmount() %> </td>
        <td> <%=bankBean1.getAddress() %> </td>
        <td> <%=bankBean1.getPhno() %> </td>
        
    </tr>
</table>

</body>
</html>