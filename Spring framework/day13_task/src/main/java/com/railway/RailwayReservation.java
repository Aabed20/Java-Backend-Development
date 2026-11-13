package com.railway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RailwayReservation 
{
	@Autowired
	@Qualifier("online")
	TicketBookingService ticketBookingService;
    
	@Value("Aabed Pathan")
	private String passengerName;
	
	private String seatNumber;
	
	public void displayData()
	{
		System.out.println(toString());
		System.out.println(ticketBookingService);
		ticketBookingService.bookingConfirmation();
	}
	
	@Autowired
	@Qualifier("online")
	public void setSeatNumber(TicketBookingService service)
	{
		this.seatNumber=service.getTicketinfo();
	}
	
	public String toString()
	{
		return "Passenger Name = "+this.passengerName+", Seat Number = "+this.seatNumber;
	}

}
