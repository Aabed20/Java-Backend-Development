package com.multithreading;

public class EvenOddDemo 
{
	public static void main(String[] args)
	{
		EvenOdd eo = new EvenOdd();
		
		Thread even = new Thread(
				()->
				{
					try
					{
						eo.Even();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				});
		
		Thread odd = new Thread(
				()->
				{
					try
					{
						eo.Odd();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
				
				);
				
				even.start();
				odd.start();
				

	}

}
