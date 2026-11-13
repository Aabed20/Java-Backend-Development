package com.aabed.Exception_Handling;

import java.util.Scanner;

public class ArrayIndexExceptionDemo 
{
	public static void main(String[] args)
	{
	  int a[] = new int[2];
	  a[0] = 10;
	  a[1] = 20;
	  
	  Scanner sc = new Scanner(System.in);
	  
	  try
	  {
	  IO.print("Enter index you want to print : ");
	  int index = sc.nextInt();
	  IO.println("Value at "+index+" index is "+a[index]);
	  }
	  catch(Exception e)
	  {
		  
		  IO.println(e.getMessage());
		  IO.println(e);
		  IO.println("You tried to access an invalid array index. Please check the index range");
		  e.printStackTrace();
	  }

	}

}
