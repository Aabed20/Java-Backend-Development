package com.aabed.RTPs;

abstract class Vehicle
{
  public abstract double rentCalculation(int days);
  
}
class Car extends Vehicle
{
  private String vehicleNumber;
  private String brand;
  
	public Car(String vehicleNumber, String brand) 
	{
	super();
	if(vehicleNumber.isBlank()) 
		{
		IO.println("Vehicle Number is required.");
		System.exit(0);
		}
	this.vehicleNumber = vehicleNumber;
	if(brand.isBlank()) 
	{
	IO.println("Brand name is required.");
	System.exit(0);
	}
	this.brand = brand;
    }
	
	@Override
	public String toString() {
		return "Car [vehiclenumber=" + vehicleNumber + ", brand=" + brand + "]";
	}

	@Override
	public double rentCalculation(int days) 
	{
		if(days<=0)
		{
			IO.println("Days must be in positive");
			System.exit(0);
		}
		return 1500*days;
	}
	
}
class Bike extends Vehicle
{
	private String vehicleNumber;
    private String brand;

	public Bike(String vehicleNumber, String brand) {
		super();
		if(vehicleNumber.isBlank()) 
		{
		IO.println("Vehicle Number is required.");
		System.exit(0);
		}
	   this.vehicleNumber = vehicleNumber;
	    if(brand.isBlank()) 
	      {
	       IO.println("Brand name is required.");
	       System.exit(0);
	       }
	     this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Bike [vehiclenumber=" + vehicleNumber + ", brand=" + brand + "]";
	}

	@Override
	public double rentCalculation(int days) 
	{
	
		return 500*days;
	}
	
}
public class VehicleTest
{
	public static void main(String[] args)
	{
		String choice = IO.readln("Enter which vehicle you want : ");
		String vehiclenumber = IO.readln("Enter vehicle number : ");
		String brand = IO.readln("Enter vehicle brand : ");
		int days = Integer.parseInt(IO.readln("Enter number of days you want vehicle : "));
		if(days<=0)
		{
			System.err.println("Days must be in positive");
			System.exit(0);
		}
		Vehicle v = null;
		if(choice.equalsIgnoreCase("car"))
		{
	       v = new Car(vehiclenumber,brand);
	       IO.println(v);
	       IO.println("Total rent will be "+v.rentCalculation(days));   
		}
		
		else if(choice.equalsIgnoreCase("bike"))
		{
			v = new Bike(vehiclenumber,brand);
			IO.println(v);
		    IO.println("Total rent will be "+v.rentCalculation(days));
			
		}
		else
		{
			IO.println(choice+" vehicle is not Available.");
		}
		
	}
	
}


