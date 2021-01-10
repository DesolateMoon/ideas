<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register and Login</title>
</head>
<body>
	<!-- TODO: Register and Login Buttons -->
	<p> ${message}</p>
	<h3>Register</h3>
	<form method="post">
		Name : <input type="text" name="regName" required/><br> 
		Email : <input type="email" name="regEmail" required/><br> 
		Password : <input type="password" name="regPassword" pattern=".{8,}"/><br>
		Password Conf: <input type="password" name="regPasswordConf" pattern=".{8,}"/><br> 
		<input type="submit" value="Register" />
	</form>
	</br> </br>
	<h3>Login</h3>
	<form method="post">
		Email : <input type="text" name="logEmail" /><br> 
		Password : <input type="password" name="logPassword" /><br> 
		<input type="submit" value="Login" />
	</form>
</body>
</html>