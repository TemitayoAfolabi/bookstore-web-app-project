<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<style>
body {margin: 0;
 background: rgba(0, 128, 0, 0.3);}
 
 table {
	font-family : Arial, Helvetica, sans-serif;	
	font-size : 100%;
    font-weight: bold;
    background-color: light green
}
 h1 {
   color: black;
   font-family: Arial;
   text-align: center
 }
 table.center {
  margin-left: auto; 
  margin-right: auto;
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

<!--	<form action="http://localhost:8080/online-book-store-application/CustomerRegistrationServlet" method="POST">
		<table class ="center" style ="margin-top:200px">
		<tr>
		<td><label for="firstName">First name:</label><br> </td>
		<td><input type="text" id="firstName" name="firstName" value="" ><br></td> 
		</tr>
		<tr>
		<td><label for="lastName">Last name:</label><br></td> 
		<td><input type="text" id="lastName" name="lastName" value=""><br></td>
		</tr>
		<tr>
		<td><label for="customerEmail">Email:</label><br> </td>
		<td><input type="text" id="customerEmail" name="customerEmail" placeholder="Enter a valid Email"><br></td> 
		</tr>
		<tr>
		<td><label for="customerpassword">Password:</label><br> </td>
		<td><input type="password" id="customerpassword" name="customerpassword" placeholder="Enter a valid Password"><br></td>
		</tr>
		<tr>
		<td><input type="submit" class="signupbtn" value="Sign up"></td>
		</tr>
		</table> 
			</form>
	-->
		
<link href="https://unpkg.com/tailwindcss@%5E1.0/dist/tailwind.min.css"  rel="stylesheet">	
		
 <div class="min-h-full flex items-center justify-center py-12 px-4 sm:px-6 lg:px-8">
  <div class="max-w-md w-full space-y-8">
    <div>
      <img class="mx-auto h-12 w-auto" src="https://tailwindui.com/img/logos/workflow-mark.svg?color=green&shade=600" alt="Workflow">
      <h2 class="mt-6 text-center text-3xl tracking-tight font-bold text-gray-900">Registration Form</h2>
    </div>
    <form class="mt-8 space-y-6" action="http://localhost:8080/online-book-store-application/CustomerRegistrationServlet" method="POST">
      <input type="hidden" name="remember" value="true">
      <div class="rounded-md shadow-sm -space-y-px">
      <div>
          <label for="firstName" class="sr-only">First Name</label>
          <input id="firstName" name="firstName" type="firstName" autocomplete="firstName" required class="appearance-none rounded-none relative block w-full px-3 py-2 border border-gray-300 placeholder-gray-500 text-gray-900 rounded-t-md focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 focus:z-10 sm:text-sm" placeholder="First Name">
        </div>
        <div>
          <label for="lastName" class="sr-only">Last Name</label>
          <input id="lastName" name="lastName" type="lastName" autocomplete="lastName" required class="appearance-none rounded-none relative block w-full px-3 py-2 border border-gray-300 placeholder-gray-500 text-gray-900 rounded-t-md focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 focus:z-10 sm:text-sm" placeholder="Last Name">
        </div>
        <div>
          <label for="customerEmail" class="sr-only">Email address</label>
          <input id="customerEmail" name="customerEmail" type="customerEmail" autocomplete="customerEmail" required class="appearance-none rounded-none relative block w-full px-3 py-2 border border-gray-300 placeholder-gray-500 text-gray-900 rounded-t-md focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 focus:z-10 sm:text-sm" placeholder="Email address">
        </div>
        <div>
          <label for="customerpassword" class="sr-only">Password</label>
          <input id="customerpassword" name="customerpassword" type="password" autocomplete="customerpassword" required class="appearance-none rounded-none relative block w-full px-3 py-2 border border-gray-300 placeholder-gray-500 text-gray-900 rounded-b-md focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 focus:z-10 sm:text-sm" placeholder="Password">
        </div>
      </div>


      <div>
        <button type="submit" class="group relative w-full flex justify-center py-2 px-4 border border-transparent text-sm font-medium rounded-md text-white bg-green-600 hover:bg-green-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500">
          <span class="absolute left-0 inset-y-0 flex items-center pl-3">
            <!-- Heroicon name: solid/lock-closed -->
            <svg class="h-5 w-5 text-indigo-500 group-hover:text-indigo-400" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="green" aria-hidden="true">
              <path fill-rule="evenodd" d="M5 9V7a5 5 0 0110 0v2a2 2 0 012 2v5a2 2 0 01-2 2H5a2 2 0 01-2-2v-5a2 2 0 012-2zm8-2v2H7V7a3 3 0 016 0z" clip-rule="evenodd" />
            </svg>
          </span>
          Sign Up
        </button>
      </div>
    </form>
  </div>
</div>
		
		

</body>
</html>