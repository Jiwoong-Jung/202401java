<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
for (int i=0; i<10; i++) {
%>
	<h1>안녕 JSP <%=i %></h1>
<%} %>
</body>
</html>