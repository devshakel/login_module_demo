<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Videos</title>
</head>
<body>
<%
response.setHeader("cache-control", "no-cache, no-store, must-revalidate");
response.setHeader("pragma", "no-cache");
response.setHeader("Expires", "0");
if(session.getAttribute("uname")==null){
	response.sendRedirect("login.jsp");
}
%>

<video width="320" height="240" controls autoplay><source src="videos/Learn_language.mp4"></video>

<form action="Logout">
<input type="submit" value="Logout">
</form>
</body>
</html>