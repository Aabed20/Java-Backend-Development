package com.aabed.Exception_Handling;

public class DivisionExample
{
	public static void main(String[] args)
	{
	  int dividend = Integer.parseInt(IO.readln("Enter dividend : "));
	  
	  int divisor = Integer.parseInt(IO.readln("Enter diviend : "));
		
	  performDivision(dividend, divisor);

	}
	public static int performDivision(int a, int b)
	{
		try
		{
			IO.println("Result of division : "+a/b);
			
		}
		catch(ArithmeticException e)
		{
			IO.println("ArithmeticException caught: Division by zero: dividend="+a+", divisor="+b);
		}
		
		return 0;
	}

}
