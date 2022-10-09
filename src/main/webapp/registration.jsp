<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>

<h1> Registration Form</h1>

<form action="http://localhost:8080/BookstoreWebSystem/CustomerRegistration" method= "post">

	First Name :<input type="text" name="firstName"/> <br>
	
	Last Name :<input type="text" name="lastName"/> <br>
	
	Email :<input type="text" name="email"/> <br>
	
	Password :<input type="password" name="password"/> <br>
	
	<input type="submit" value="Register"/>



</form>

Registered customer? <a href="login.jsp"/> Click here to login  </a>


</body>
</html> 