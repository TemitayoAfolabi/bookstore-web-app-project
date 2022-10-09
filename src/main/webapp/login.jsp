<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 	
 	<h1>Login form </h1>

	<form action="http://localhost:8080/BookstoreWebSystem/CustomerLoginServlet" method = "post">

	Email ID : <input type= "text" name = "customerEmail"/> <br>

	Password : <input type= "text" name = "customerPassword"/> <br>

	<input type = "submit" value = "login"/>
	
	
	
	</form>
	
	New Customer? <a href="registration.jsp"/> Click here to register </a> 



</body>
</html>