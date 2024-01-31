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
request.setCharacterEncoding("utf-8");
%>
국어: <%= request.getParameter("kor") %><br/>
수학: <%= request.getParameter("math") %><br/>
영어: <%= request.getParameter("eng") %><br/>
</body>
</html>