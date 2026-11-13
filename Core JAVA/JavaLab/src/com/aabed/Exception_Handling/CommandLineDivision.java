package com.aabed.Exception_Handling;

public class CommandLineDivision
{
	public static void main(String[] args)
	{
		try
		{
			if(args.length<2)
			{
				throw new IllegalArgumentException();
			}
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			try
			{
				double result = a/b;
				IO.println("Division result: "+result);
				
			}
			catch(ArithmeticException e)
			{
				IO.println("Arithmetic error: "+e.getMessage());
			}
			
		}
		catch(IllegalArgumentException e)
		{		
				IO.println("NumberFormatException:" +e.getMessage());	
		}
		
		finally
		{
			IO.println("Division operation completed.");
		}

	}

}
