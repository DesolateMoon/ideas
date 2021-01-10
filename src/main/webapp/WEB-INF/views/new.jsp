<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Create a new idea</h1>
	<form method="post">
		Content : <input type="text" name="content" /><br> 
		<input type="submit" value="Create" />
	</form>
</body>
</html>