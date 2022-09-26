<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <%-- <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %> --%>

            <!DOCTYPE html>
            <html>

            <head>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
                    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
                    crossorigin="anonymous">
                <meta charset="ISO-8859-1">
                <title>Ticket Booking</title>

                <style>
                    .error {
                        color: red;
                    }

                    body {
                        text-align: center;
                    }
                </style>

            </head>

            <body style="background-color: rgb(200, 240, 300)">
                <br>
                <br>
                <!-- Add code here.. -->
                <p align="center">
                <h1>Indian Railway System</h1><br><br>
                <h2>Book Your Tatkal Ticket</h2>

                <form action="getTicketBooking" >
                    <div class="row mb-1" >
                        <div class="col-md-4"></div>
                        <div class="col-md-4"> Customer Name : <input type="text" name="customerName"
                                value="${ticketBooking.customerName}" /></div>
                        <div class="col-md-4" style="margin-left:-70px"><form:errors class="error" path="ticketBooking.customerName"> </form:errors></div>

                    </div>


                    <div class="row mb-1">
                        <div class="col-md-4"></div>
                        <div class="col-md-4"> Mobile Number : <input type="text" name="mobileNumber"
                                value="${ticketBooking.mobileNumber}" /></div>
                        <div class="col-md-4" style="margin-left:-70px">
                            <form:errors class="error" path="ticketBooking.mobileNumber"> </form:errors>
                        </div>

                    </div>

                    <div class="row mb-1">
                        <div class="col-md-4"></div>

                        <div class="col-md-4"><label style="margin-left: -92px;" for="source">From: </label> 
                            <select style="margin-left: 80px;"
                                id="source" name="source">
                                <option value="Pune">Pune</option>
                                <option value="Delhi">Delhi</option>
                                <option value="Bangalore">Bangalore</option>
                                <option value="Chennai">Chennai</option>
                            </select><br>
                        </div>


                    </div>


                    <div class="row mb-1">
                        <div class="col-md-4"></div>

                        <div class="col-md-4"><label style="margin-left: -90px;" for="destination">To: </label> 
                            <select style="margin-left:100px"
                                id="destination" name="destination">
                                <option value="Pune">Pune</option>
                                <option value="Delhi">Delhi</option>
                                <option value="Bangalore">Bangalore</option>
                                <option value="Chennai">Chennai</option>
                            </select><br>
                        </div>


                    </div>


                    <div class="row mb-1">
                        <div class="col-md-4">
                        </div>
                        <div class="col-md-4"> <label style="margin-left: -20px;" for="tier">Class:</label>
                            <select style="margin-left: 80px;" id="tier" name="tier">
                                <option value="1A">AC First Class (1A)</option>
                                <option value="2A">AC 2 Tier (2A)</option>
                                <option value="3A">AC 3 Tier (3A)</option>
                                <option value="SL">Sleeper (SL)</option>
                                <option value="2S">Second Seating (2S)</option>
                                </select><br>
                        </div>

                    </div>

                    

                    <div class="row mb-2">
                        <div class="col-md-4">
                        </div>
                        <div class="col-md-4">No. Of Tickets: &ensp;<input style="margin-left: 8px;" type="text" name="noOfTickets"
                                value="${ticketBooking.noOfTickets}" /></div>
                        <div class="col-md-4" style="margin-left:-70px">
                            <form:errors class="error" path="ticketBooking.noOfTickets"> </form:errors>
                        </div>

                    </div>

                    <div class="row mb-1">
                        <div class="col-md-4" style="margin-right: 40px;">
                        </div>
                        <div class="col-md-1"><input type="submit" class="btn btn-success" value="Book">&emsp;&emsp;&emsp;&emsp;</div>
                        <div class="col-md-1"><input type="reset" class="btn btn-danger" value="Clear"></div>
                        <div class="col-md-5"></div>
                    </div>

                </form>
            </body>

            </html>