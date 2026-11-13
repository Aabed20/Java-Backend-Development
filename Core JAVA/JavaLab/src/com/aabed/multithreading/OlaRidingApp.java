package com.aabed.multithreading;

import java.sql.Driver;

class RideRequest extends Thread
{
	@Override
	public void run()
	{
		IO.println("User requested a ride...");
		try 
		{
		Thread.sleep(2000);
		IO.println("Searching for nearby drivers...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class DriverAssignment extends Thread
{
	@Override
	public void run()
	{
		
		try 
		{
		Thread.sleep(3000);
		IO.println("Driver found and assigned!!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class FareCalculation extends Thread
{
	@Override
	public void run()
	{
		IO.println("Calculating estimated fare...");
		try 
		{
		Thread.sleep(1500);
		IO.println("Estimated fare: 135.75 RS....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class LiveTracking extends Thread
{
	@Override
	public void run()
	{
		try 
		{
		for(int i=2; i<=10; i=i+2)
		{
			Thread.sleep(1000);
			IO.println("Updating ride location... "+i+"0% completed");
		}
		IO.println("Ride completed!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class PaymentProcessing extends Thread
{
	@Override
	public void run()
	{
		IO.println("Processing payment...");
		try 
		{
		Thread.sleep(2000);
		IO.println("Payment Successful!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class RatingSystem extends Thread
{
	@Override
	public void run()
	{
		IO.println("Requesting user rating...");
		try 
		{
		Thread.sleep(1000);
		IO.println("User rated the ride: 5 star!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class OlaRidingApp
{
	public static void main(String[] args)
	{
	   RideRequest rr = new RideRequest();
	   DriverAssignment da = new DriverAssignment();
	   FareCalculation fc = new FareCalculation();
	   LiveTracking lt = new LiveTracking();
	   PaymentProcessing pp = new PaymentProcessing();
	   RatingSystem rs = new RatingSystem();
	   try
	   {
	   rr.start();
	   fc.start();
	   rr.join();
	   fc.join();
	   da.start();
	   da.join();
	   lt.start();
	   lt.join();
	   pp.start();
	   pp.join();
	   rs.start();
	   rs.join();
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }

	}

}
