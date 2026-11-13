package com.aabed.loose_coupling;

@FunctionalInterface
interface Area
{
	double calculate(double x, double y);
}

public class DriverCode 
{
	public static void main(String[] args)
	{
	   Area rectangle = (x,y) ->
	   {
		   return x*y;
	   };
	   IO.println("Rectangle Area = "+rectangle.calculate(10, 20));

	   Area Triangle = (x,y) ->
		   {
			   return 0.5*x*y;
		   };
	 IO.println("Triangle Area = "+Triangle.calculate(10, 20));
	 
	 Area Parallelogram = (x,y) ->
	   {
		   return x*y;
	   };
	   IO.println("Parallelogram Area = "+Parallelogram.calculate(10, 20));
	   
	   
	   
	}

}
