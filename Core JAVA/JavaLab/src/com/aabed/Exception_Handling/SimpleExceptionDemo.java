package com.aabed.Exception_Handling;

import java.util.Scanner;

public class SimpleExceptionDemo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try 
		{
		IO.print("Enter the first integer (a) : ");
		int a = sc.nextInt();
		IO.print("Enter the second integer (b) : ");
		int b = sc.nextInt();
		IO.println("You entered a = "+a+" and b = "+b);
		}
		catch(Exception e)
		{
			
			IO.println(e.getMessage());
			IO.println(e);
			IO.println("InputMismatchException Occurred. Please enter only integer numbers.");
			e.printStackTrace();
		}

	}

}
