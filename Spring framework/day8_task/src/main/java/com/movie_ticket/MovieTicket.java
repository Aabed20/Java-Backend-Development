package com.movie_ticket;

import java.util.Objects;

public class MovieTicket
{

private int ticketId;
private String movieName;
private String customerName;
private String seatNumber;

public MovieTicket()
{}

public int getTicketId() {
	return ticketId;
}

public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}

public String getMovieName() {
	return movieName;
}

public void setMovieName(String movieName) {
	this.movieName = movieName;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getSeatNumber() {
	return seatNumber;
}

public void setSeatNumber(String seatNumber) {
	this.seatNumber = seatNumber;
}

@Override
public int hashCode() {
	return Objects.hash(customerName, movieName, seatNumber, ticketId);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	MovieTicket other = (MovieTicket) obj;
	return Objects.equals(customerName, other.customerName) && Objects.equals(movieName, other.movieName)
			&& Objects.equals(seatNumber, other.seatNumber) && ticketId == other.ticketId;
}

@Override
public String toString() {
	return "MovieTicket [ticketId=" + ticketId + ", movieName=" + movieName + ", customerName=" + customerName
			+ ", seatNumber=" + seatNumber + "]";
}

}
