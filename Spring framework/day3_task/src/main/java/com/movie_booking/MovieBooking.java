package com.movie_booking;

public class MovieBooking
{
	private int bookingId;
	private String movieName;
	private String theaterName;
	private String seatNumber;
	private String showTime;
	
	public MovieBooking(int bookingId, String movieName) {
		super();
		this.bookingId = bookingId;
		this.movieName = movieName;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	@Override
	public String toString() {
		return "MovieBooking [bookingId=" + bookingId + ", movieName=" + movieName + ", theaterName=" + theaterName
				+ ", seatNumber=" + seatNumber + ", showTime=" + showTime + "]";
	}
	
	

}
