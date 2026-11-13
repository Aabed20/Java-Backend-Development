package builder.desgin_pattern;

class TravelBooking 
{
  
  private String source;
  private String destination;
  private int passengers;
  private String travelClass;
  
  public TravelBooking() { }
  
  public void setSource(String source)
  { 
	  this.source = source; 
  }
  
  public void setDestination(String destination) 
  {
    this.destination = destination;
  }

  public void setPassengers(int passengers) 
  {
    this.passengers = passengers;
  }

  public void setTravelClass(String travelClass) 
  {
    this.travelClass = travelClass;
  }
   
  @Override
  public String toString() 
  {
    return "TravelBooking [source=" + source
    + ", destination=" + destination
    + ", passengers=" + passengers
    + ", travelClass=" + travelClass + "]";
  }
}

class TravelBookingBuilder
{
	  private String source;
	  private String destination;
	  private int passengers;
	  private String travelClass;
	
	  public TravelBookingBuilder() {}
	  
	  public TravelBookingBuilder setSource(String source)
	  {
		  this.source=source;
		  return this;
	  }
	  
	  public TravelBookingBuilder setDestination(String destination)
	  {
		  this.destination=destination;
		  return this;
	  }
	  
	  public TravelBookingBuilder setPassengers(int passengers)
	  {
		  this.passengers=passengers;
		  return this;
	  }
	  
	  public TravelBookingBuilder setTravelClass(String travelClass)
	  {
		  this.travelClass=travelClass;
		  return this;
	  }
	  
	  public TravelBooking build()
	  {
		  TravelBooking booking = new TravelBooking();
		  booking.setSource(this.source);
		  booking.setDestination(this.destination);
		  booking.setPassengers(this.passengers);
		  booking.setTravelClass(this.travelClass);
		  return booking;
	  }
}

public class SecondApp
{
	public static void main(String[] args) 
	{
		TravelBooking booking1 = new TravelBookingBuilder().setSource("Hyderabad").setDestination("Banglore")
		    .setPassengers(2)
		    .setTravelClass("Business")
		    .build();
		
		System.out.println(booking1);
		
		TravelBooking booking2 = new TravelBookingBuilder().setSource("Nanded").setDestination("Hyderabad")
		     .setPassengers(2)
		      .setTravelClass("Economy")
		      .build();
		
		System.out.println(booking2);

	}

}
