<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

<%
	String username = (String) session.getAttribute("uname");
	response.setHeader("cache-control", "no-cache, no-store, must-revalidate"); // HTTP version - 1.1
	response.setHeader("pragma", "no-cache");
	response.setHeader("Expires", "0");
	if(username==null){
		response.sendRedirect("login.jsp");
	}
%>

<p>Welcome.  <%= username %></p>

<a href="videos.jsp">Videos here</a>
<form action="Logout">
<input type="submit" value="Logout">
</form>

</body>
</html>