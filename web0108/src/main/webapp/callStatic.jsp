<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="web0108.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
for (int i=0; i < Student.names.length; i++) {
%>
	<%=Student.names[i] %><br>
<%} %>
</body>
</html>