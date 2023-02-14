<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<h1>${Msg}</h1>
<h1>Login Form</h1>
<form action="login" method="post">
Email:<input type="text" name="email"><br><br>
Password:<input type="text" name="password"><br><br>
<button type="submit">Login</button>
<button type="reset">Cancel</button>
</form>
<br>
<a href="loademployee">New? Click here to Signup</a>

</body>
</html>