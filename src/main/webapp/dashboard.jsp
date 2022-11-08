
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Dashboard</title>
</head>
<body>
	<%

  response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); //prevent back button after logout HTTP 1.1
  //HTTP 1.0 and if you use proxy seperatly should remove cache to prevent back button	
   response.setHeader("Pragma","no-cache"); //HTTP 1.0
   response.setDateHeader ("Expires", 0);
  if(session.getAttribute("email")==null){
	response.sendRedirect("login.jsp");
}
%>			
<style>			


body 
{
  margin: 0;
  background: rgba(0, 128, 0, 0.3);
  
}
 letter {
   color: #ea503f;
   font-family: Arial;
   float: center;
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
<form action="http://localhost:8080/online-book-store-application/LogoutCustomerServlet" method="GET">
<div>
<ul class="topnav">
  <li><a class="active" href="welcome.jsp">Home</a></li>
  <li class="right"><a href="login.jsp">Logout</a></li>  
</ul>
<br>
<br>
<br>
<br>	
</div>
</form>	
<form action="http://localhost:8080/online-book-store-application/AccountDetailsServlet"  method="GET">

<%

session.getAttribute("email");
session.getAttribute("modifyCustomer");

%>
<center>
<div>	
<p style="color: red;"><h1>Welcome ${email} !!!</h1></p>	
</div>	

 <input type="text" id="email" name="email" value= "${email}" hidden="" >
        <button type="submit" class="group relative w-full flex justify-center py-2 px-4 border border-transparent text-sm font-medium rounded-md text-white bg-green-600 hover:bg-green-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500">
          <span class="absolute left-0 inset-y-0 flex items-center pl-3">
            <!-- Heroicon name: solid/lock-closed -->
            <svg class="h-5 w-5 text-indigo-500 group-hover:text-indigo-400" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="green" aria-hidden="true">
              <path fill-rule="evenodd" d="M5 9V7a5 5 0 0110 0v2a2 2 0 012 2v5a2 2 0 01-2 2H5a2 2 0 01-2-2v-5a2 2 0 012-2zm8-2v2H7V7a3 3 0 016 0z" clip-rule="evenodd" />
            </svg>
          </span>
          View Information
        </button>
 </form>
 <br>
  <br>
 <form action="http://localhost:8080/online-book-store-application/ModifyCustomerServlet"  method="POST">
  <button type="submit" class="group relative w-full flex justify-center py-2 px-4 border border-transparent text-sm font-medium rounded-md text-white bg-green-600 hover:bg-green-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500">
          <span class="absolute left-0 inset-y-0 flex items-center pl-3">
            <!-- Heroicon name: solid/lock-closed -->
            <svg class="h-5 w-5 text-indigo-500 group-hover:text-indigo-400" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="green" aria-hidden="true">
              <path fill-rule="evenodd" d="M5 9V7a5 5 0 0110 0v2a2 2 0 012 2v5a2 2 0 01-2 2H5a2 2 0 01-2-2v-5a2 2 0 012-2zm8-2v2H7V7a3 3 0 016 0z" clip-rule="evenodd" />
            </svg>
          </span>
          Modify Accounts 
        </button>
 </form>
</center>						
</body>
</html>