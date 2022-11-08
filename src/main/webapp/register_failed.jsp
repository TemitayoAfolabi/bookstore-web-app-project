<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
body {margin: 0;
 background: rgba(0, 128, 0, 0.3);}
 
 h1{
 text-align: center;
  padding-top: 200px;
 
 }
 letter {
   color: #ea503f;
   font-family: Arial;
 }

ul.topnav {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

ul.topnav li {float: left;}

ul.topnav li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

ul.topnav li a:hover:not(.active) {background-color: #111;}

ul.topnav li a.active {background-color: #04AA6D;}

ul.topnav li.right {float: right;}

@media screen and (max-width: 600px) {
  ul.topnav li.right, 
  ul.topnav li {float: none;}
}
</style>
</head>
<body>
<div>
<ul class="topnav">
  <li><a class="active" href="welcome.jsp">Home</a></li>
  <li class="right"><a href="login.jsp">Login</a></li>
  <li class="right"><a href="index.jsp">Sign Up</a></li> 
</ul>
</div>
	<p style="color: red;"><h1>Registration Failed !!!</h1></p>

</body>
</html>