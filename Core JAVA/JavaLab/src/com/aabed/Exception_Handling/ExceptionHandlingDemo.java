package com.aabed.Exception_Handling;

import java.util.Scanner;

public class ExceptionHandlingDemo
{
	public static void main(String[] args)
	{
      
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s1 = sc.next();
		handleExceptions(s1,sc);

	}
	
	public static void handleExceptions(String str,Scanner sc) 
	{
		
		try(sc)
		{
			
			IO.println("Length of the input string: "+str.length());
            IO.println("Converted to integer: "+Integer.parseInt(str));
            IO.println("Uppercase version: "+str.toUpperCase());
		}
		catch(Exception e)
		{
			
			if(e instanceof NumberFormatException)
			{
				IO.println("NumberFormatException: Input is not a valid integer.");
			}
			if(e instanceof NullPointerException)
			{
				IO.println("NullPointerException: Input is null");
			}
		}
		
		
	}

}
