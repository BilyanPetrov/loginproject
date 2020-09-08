<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
	
	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");
		if(!(session.getAttribute("username")==null)){
			response.sendRedirect("welcome.jsp");
		}
		
	%>
	
	<form action="Login" method="post">
		Enter username: <input type="text" name="uname"><br>
		Enter password: <input type="password" name="pass"><br>
		<input type="submit" value="login">
	</form>
	<br>
	<form action="register.jsp">
    	<input type="submit" value="Register" />
	</form>
</body>
</html>