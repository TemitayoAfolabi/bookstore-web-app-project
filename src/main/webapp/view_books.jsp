<%@page import="com.ab.models.Books"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Books Available</title>
</head>
<body>


<h1> List of Books Available </h1>


	<%
	
		List<Books> bookList = (List<Books>)session.getAttribute("bList");
	
	%>

	<table border = "1">
	
	
		<tr>
		
			<th> Book ID </th>
			<th> Title </th>
			<th> Author </th>
			<th> Overview </th>
			<th> Amount </th>
			
		</tr>
		
	
	<%
		for(Books b : bookList){
			
		
	
	%>
		<tr>
		
			<td> <%=b.getBookID()%> </td>
			<td> <%=b.getTitle()%> </td>
			<td> <%=b.getAuthor()%> </td>
			<td> <%=b.getOverview()%> </td>
			<td> <%=b.getAmount()%> </td>
		</tr>
		
		
	<%
	
		}
	%>
	
	
	
	</table>


</body>
</html>