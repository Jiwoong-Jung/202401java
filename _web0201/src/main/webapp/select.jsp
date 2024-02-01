<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="index.jsp">목록으로</a>
<%
String driver="oracle.jdbc.driver.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:xe";
Class.forName(driver);
Connection conn = DriverManager.getConnection(url, "scott", "tiger");
String sql = "select ename, job, sal from emp1";
PreparedStatement pstmt = conn.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery(); %>
<table border="1">
<%
while (rs.next()) { %>
	<tr>
		<td>
		<a href="updateForm.jsp?ename=<%=rs.getString("ename") %>">
		<%=rs.getString("ename") %></a></td>
		<td><%=rs.getString("job") %></td>
		<td><%=rs.getString("sal") %></td>
		<td><a href="delete.jsp?ename=<%=rs.getString("ename")%>">삭제</a></td>
	</tr>
<%} %>	
</table>

</body>
</html>




