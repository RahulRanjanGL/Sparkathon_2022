<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket Booking Details</title>

<style>
	#pnr{
		background-color: yellow;
	}
</style>

</head>
<body style="background-color: rgb(200, 240, 300)">
	<br>
	<br>
	
	<!--Add code here  -->
	
	<h2>Congratulations, your ticket got booked!!</h2>

		<table border="1" >
		
	<tbody>
		
		<tr id = pnr>
			<td>PNR Number:</td>
			<td>${pnrNumber}</td>
		</tr> 
		
		<tr>
			<td>Train Number:</td>
			<td>${trainNumber}</td>
		</tr>
		
		<tr>
			<td>Train Name:</td>
			<td>${trainName}</td>
		</tr>
		
		<tr>
			<td>Date of Travel:</td>
			<td>${dateOfTravel}</td>
		</tr>
		
		<tr>
			<td>Departure:</td>
			<td>${departure}</td>
		</tr>
		
		<tr>
			<td>Duration:</td>
			<td>${duration}</td>
		</tr>
		
		<tr>
			<td>Arrival:</td>
			<td>${arrival}</td>
		</tr>
		
		<tr>
			<td>Total Fare Amount:</td>
			<td>${totalfareAmount}</td>
		</tr>
		
   </tbody>
</table>

	  <br>
 	 <a href="showTicketBookingForm"> Book Another Ticket </a>
	
</body>
</html>