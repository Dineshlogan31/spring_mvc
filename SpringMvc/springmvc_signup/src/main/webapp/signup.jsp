<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
</head>
<body>
<spring:form action="signup" modelAttribute="emp" >
Name:<spring:input path="name"/>
Email:<spring:input path="email"/>
Mobile:<spring:input path="mobile"/>
Password:<spring:input path="password"/>
<spring:button>Signup</spring:button>

</spring:form>


</body>
</html>