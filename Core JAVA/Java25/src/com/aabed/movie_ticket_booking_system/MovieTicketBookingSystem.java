package com.aabed.movie_ticket_booking_system;

import java.util.*;

class Movie
{
	private int movieId;
	private String movieName;
	private String showTime;
	private int totalSeats;
	
	public Movie(int movieId, String movieName, String showTime, int totalSeats) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.showTime = showTime;
		this.totalSeats = totalSeats;
	}
	
	

	public int getMovieId() {
		return movieId;
	}



	public String getMovieName() {
		return movieName;
	}



	public String getShowTime() {
		return showTime;
	}



	public int getTotalSeats() {
		return totalSeats;
	}



	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}



	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}



	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}



	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}



	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", showTime=" + showTime + ", totalSeats="
				+ totalSeats + "]";
	}
	
}

class Booking
{
	private int movieId;
	HashSet<Integer> bookedSeats;
	public Booking(int movieId) 
	{
		this.movieId = movieId;
	}
	
	@Override
	public String toString() {
		return "Booking [movieId=" + movieId + ", bookedSeats=" + bookedSeats + "]";
	}
	
	
	
	
}

class BookingService
{
	ArrayList<Movie> movies;
	ArrayList<Booking> bookings;
	
	
	
	public BookingService() 
	{
		this.movies = new ArrayList<>();
		this.bookings = new ArrayList<>();
		
	}

	public void addMovie()
	{
		IO.println("Enter Movie details to Add : ");
		int id = Integer.parseInt(IO.readln("Enter Movie Id : "));
		String name = IO.readln("Enter movie name : ");
		String showTime = IO.readln("Enter show Time : ");
		int seats = Integer.parseInt(IO.readln("Enter Total of Seats : "));
		if( movies.add(new Movie(id, name, showTime, seats)))
		{
			IO.println("Movie Added Succesfully!!!");
		}
		else
		{
			IO.println("Movie Not Stored!!!");
		} 
	}
	
	public void getAllMovieDetails()
	{
		IO.println("Which Movie details you want : ");
		movies.forEach(movie -> IO.println(movie+"\n"));
	}
	
	public void totalNumberOfMovies()
	{
		IO.println("There are "+movies.size()+" movies available.");
	}
	
	public void getSpecificMovieDetail()
	{
		boolean found = false;
		String movie = IO.readln("Enter Which details You Want : ");
		for(Movie m : movies)
		{
			if(m.getMovieName().equalsIgnoreCase(movie))
			{
				found = true;
				IO.println(m);
				break;
			}
		}
		if(!found)
		{
			IO.println(movie+" Movie not Available!!!");
		}
	}
	
	
}





public class MovieTicketBookingSystem 
{
	public static void main(String[] args)
	{
		
	}

}
