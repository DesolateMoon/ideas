<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border='1' style="width: 40%">
		<tr style="text-align:center">
			<td>${idea.getName()}</td>
		</tr>
		<h3>Created By: ${user.getName()}</h3>
		</br>
		<h3>Users who liked your idea:</h3>
	</table>

</body>
</html>