package com.aabed.Exception_Handling;

class CarStoppedException extends Exception
{
	private static final long serialVersionUID = 1L;

	public CarStoppedException(String str)
	{
		super(str);
	}	
}

class CarPunctureException extends Exception
{
	private static final long serialVersionUID = 1L;

	public CarPunctureException(String str)
	{
		super(str);
	}
}

class CarHeatException extends Exception
{
	private static final long serialVersionUID = 1L;

	public CarHeatException(String str)
	{
		super(str);
	}
}

class CarTest
{
	
	public static void stop(String s) throws CarStoppedException 
	{
		if(s.equalsIgnoreCase("stop"))
		{
			throw new CarStoppedException("Car is stopped for some reason");
		}
		else
		{
			IO.println("Car not stalled");
		}
	}
	
	public static void puncture(String s) throws CarPunctureException
	{
		
	 if(s.equalsIgnoreCase("puncture"))
		{
			throw new CarPunctureException("Car is punctured");
		}
		else
		{
			IO.println("Car not punctured");
		}
	 }
  
	public static void carHeat(int heat) throws CarHeatException
	{
		if(heat>50)
		{
			throw new CarHeatException("Car is heated more the 50 degrees Celsius.");
		}
		else
		{
			IO.println("Car temperature normal.");
		}
	}
	
}
public class CarUser
{
	public static void main(String[] args)
	{
		
		try
		{
			CarTest.stop("stop");
		}
		catch(CarStoppedException e)
		{
			IO.println(e);
		}
		try
		{
			CarTest.stop("go");
		}
		catch(CarStoppedException e)
		{
			IO.println(e);
		}
		try
		{
			CarTest.puncture("puncture");
		}
		catch(CarPunctureException e)
		{
			IO.println(e);
		}
		try
		{
			CarTest.puncture("move");
		}
		catch(CarPunctureException e)
		{
			IO.println(e);
		}
		try
		{
			CarTest.carHeat(60);
		}
		catch(CarHeatException e)
		{
			IO.println(e);
		}
		try
		{
			CarTest.carHeat(40);
		}
		catch(CarHeatException e)
		{
			IO.println(e);
		}
		
	}

}














