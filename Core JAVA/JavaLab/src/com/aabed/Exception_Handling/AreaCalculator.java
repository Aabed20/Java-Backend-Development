package com.aabed.Exception_Handling;

public class AreaCalculator
{
	public static void main(String[] args)
	{
		
      int length = Integer.parseInt(IO.readln("Enter length of rectangle: "));
      int width = Integer.parseInt(IO.readln("Enter width of rectangle: "));
      
      try 
      {
    	  if(length<=0||width<=0)
    	  {
    		  throw new IllegalArgumentException();
    	  }
    	  else
    	  {
    	  IO.println("Area of rectangle with length "+length+" and width "+width+" is: "+calculateArea(length, width));
    	  }
      }
      catch(IllegalArgumentException e)
      {
    	  IO.println("Error: Length and width must be > 0.");
      }
		
	}
	
	public static double calculateArea(double a, double b)
	{
		return a*b;
	}

}
