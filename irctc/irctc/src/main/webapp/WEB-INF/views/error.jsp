<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
</head>
<body style="background-color: rgb(200, 240, 300)">
		<br>
		<br>
		
		<!--Add code here  -->
		<h2>Unable to book ticket. Below are the error details:</h2>
		<h2>Response Code : 400</h2>
		<h2>${msg}</h2>
		<br>
		
		<a href="showTicketBookingForm"> Book Ticket </a>

</body>
</html>