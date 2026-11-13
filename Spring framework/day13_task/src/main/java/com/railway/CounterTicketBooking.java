package com.railway;

import org.springframework.stereotype.Component;

@Component("counter")
public class CounterTicketBooking implements TicketBookingService
{
	@Override
	public void bookingConfirmation() 
	{
      System.out.println("Ticket booked from Counter");		
		
	}
	
	public String toString()
	{
		return "Counter Ticket booking";
	}

	@Override
	public String getTicketinfo() 
	{
	  return "J125";	
	}

}
