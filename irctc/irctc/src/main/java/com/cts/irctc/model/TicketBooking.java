package com.cts.irctc.model;

import java.time.LocalDate;
//import java.time.LocalDateTime;
//
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;



public class TicketBooking {
	
	
	@NotEmpty(message = "Customer name is required*")
    private String customerName;
	
	@Pattern(regexp = "(^[7-9][0-9]{9}$)",message = "Mobile number should be 10 digits and starting with 7/8/9*")
	private String mobileNumber;
	
	private String fromCity;
	private String toCity;
	private String travelClass;
	
	@Min(value=1,message = "No. Of Tickets must be more than 0*")
	@Max(value=4,message = "You can book at max. 4 tickets at a time*")
	private int noOfTickets;
	
	private LocalDate dateOfTravel;
	private String pnrNumber;
	private double totalfareAmount;
	
	public TicketBooking() {
		
	}

	public TicketBooking(String customerName,String mobileNumber,String fromCity, String toCity, String travelClass,
			int noOfTickets,LocalDate dateOfTravel, String pnrNumber, double totalfareAmount) {
		super();
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.travelClass = travelClass;
		this.noOfTickets = noOfTickets;
		this.dateOfTravel = dateOfTravel;
		this.pnrNumber = pnrNumber;
		this.totalfareAmount = totalfareAmount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public String getTravelClass() {
		return travelClass;
	}

	public void setTravelClass(String travelClass) {
		this.travelClass = travelClass;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public LocalDate getDateOfTravel() {
		return dateOfTravel;
	}

	public void setDateOfTravel(LocalDate dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}

	public String getPnrNumber() {
		return pnrNumber;
	}

	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	public double getTotalfareAmount() {
		return totalfareAmount;
	}

	public void setTotalfareAmount(double totalfareAmount) {
		this.totalfareAmount = totalfareAmount;
	}

	
}
