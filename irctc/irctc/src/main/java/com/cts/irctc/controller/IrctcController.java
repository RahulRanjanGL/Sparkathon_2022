package com.cts.irctc.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.irctc.exception.ApplicationException;
import com.cts.irctc.model.TicketBooking;
import com.cts.irctc.model.TrainInfo;
import com.cts.irctc.service.IrctcService;

@Controller
public class IrctcController {
	private IrctcService service;

	
	@Autowired
	public IrctcController(IrctcService service) {
		super();
		this.service = service;
	}

	@GetMapping("/showTicketBookingForm")
	public String showTicketBookingForm(@ModelAttribute("ticketBooking") TicketBooking ticketBooking) {
		
		
		return "ticketBooking"; 
	}
	
	@GetMapping("/getTicketBooking")
	public String getCarSearchResultForm(@Valid @ModelAttribute("ticketBooking") TicketBooking ticketBooking,BindingResult result,@RequestParam String source,String destination,String tier,int noOfTickets,Model m) throws ApplicationException {
		
		if(result.hasErrors()) {
			System.out.println(result);
			
			return "ticketBooking";
		}
		else {
			
			ticketBooking.setFromCity(source);
			ticketBooking.setToCity(destination);
			ticketBooking.setTravelClass(tier);
			
			if(ticketBooking.getFromCity().equals(ticketBooking.getToCity())){
					throw new ApplicationException("Error Message : From and to city can't be same" );
			
			}
			
			TrainInfo train = new TrainInfo();
		try {
			
			train = service.getTicketBookingResult(ticketBooking);
			System.out.println(train.getTrainNumber());
			
			ticketBooking.setDateOfTravel(LocalDate.now().plusDays(1));
			
			if(train != null) { 
				
				if(!(train.getFrom().equals(train.getTo()))) {
				
				String num = train.getTrainNumber().substring(0, 3);
				String pnrNumber = num + "-" + service.getPNRNumber(ticketBooking);
				
				m.addAttribute("pnrNumber", pnrNumber);
				m.addAttribute("trainNumber",train.getTrainNumber());
				m.addAttribute("trainName",train.getTrainName());
				m.addAttribute("dateOfTravel", ticketBooking.getDateOfTravel());
				m.addAttribute("departure", train.getDeparture());
				m.addAttribute("duration", train.getDuration());
				m.addAttribute("arrival", train.getArrival());
				
				ticketBooking.setNoOfTickets(noOfTickets);
				ticketBooking.setTotalfareAmount(ticketBooking.getNoOfTickets() * train.getFarePerPassenger());
				
				m.addAttribute("totalfareAmount", ticketBooking.getTotalfareAmount());
				
			}

		}
	}
		catch(Exception e) {
			
			return "trainNotAvailable";
		  }
			
		}
		
		return "ticketBookingResult";
	}
	
	
	public List<String> populateFromCities() {
		List<String> fromCities = new ArrayList<String>();

		 fromCities.add("Chennai"); 
		  fromCities.add("Delhi"); 
		  fromCities.add("Bangalore"); 
		  fromCities.add("Pune");
				
		return fromCities;
	}
	
	
	public List<String> populateToCities() {
		List<String> toCities = new ArrayList<String>();
		 
		  toCities.add("Chennai"); 
		  toCities.add("Delhi");
		  toCities.add("Bangalore"); 
		  toCities.add("Pune");		 	
		
		return toCities;
	}
	
	
	public List<String> populateClassType() {
		List<String> classTypes = new ArrayList<String>();
		  
		  
		  classTypes.add("1A");
		  classTypes.add("2A"); 
		  classTypes.add("3A");
		  classTypes.add("SL"); 
		  classTypes.add("2S");
		  
		return classTypes;
	}
	
	
}
