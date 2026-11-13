package com.railway;

import org.springframework.stereotype.Component;

@Component("online")
public class OnlineTicketBooking implements TicketBookingService
{
	@Override
	public void bookingConfirmation()
	{
		System.out.println("Ticket Booked by Online Ticket booking");

	}
	
	public String toString()
	{
		return "online Ticket Booking";
	}

	@Override
	public String getTicketinfo() 
	{
		return "J123";
	}

}
