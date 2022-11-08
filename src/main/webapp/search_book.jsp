<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@page import="com.ab.models.Book" %>
<%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>view books</title>
<style>
body {margin: 0;
 background: rgba(0, 128, 0, 0.3);}
 
 h1{
 text-align: center;
  padding-top: 50px;
 
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
</head>
<body>
<div>
<ul class="topnav">
  <li><a class="active" href="welcome.jsp">Home</a></li>
  <li><a href="view_books.jsp">View Available Books</a></li>
  <li><a href="search_book.jsp">Search Books</a></li>
  <li><a href="http://localhost:8080/online-book-store-application/BasketAddServlet">View Basket</a></li>
  <li><a href="login.jsp">Checkout</a></li>
  <li class="right"><a href="login.jsp">Login</a></li>
  <li class="right"><a href="index.jsp">Sign Up</a></li>
  
</ul>
</div>

<div class="letter"><h1>WELCOME TO SEARCH A BOOK</h1> </div>
 <center>
 <form action="http://localhost:8080/online-book-store-application/SerachBookServlet"  method="POST">
 <input type="text" id="search" name="search" placeholder="Enter a valid ISBN">
 <input type="submit"  value="Search"></center>
<center>
<br>
<%
//Book title =(Book)session.getAttribute("searchBook");


 
%> 
<br>
<table border="4" style="width:15%">
  <tr>
    <th>Search Results</th>
  </tr>
       <td> ${bookTitle} </td>
        
  </tr>
</table>
</center>
</form>

</body>
</html>