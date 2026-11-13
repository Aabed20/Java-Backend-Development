package com.multithreading;

public class Print1to10Using3Thread 
{
	static int num = 1;
	private boolean first = true;
	private boolean second = false;
	private boolean third = false;
	
	synchronized void printFirst() throws InterruptedException
	{
		
		for(int i=1; i<=3; i++)
		{
			while(!first)
			{
				wait();
			}
			
			IO.println(num++);
			first = false;
			second = true;
			notifyAll();
		}
		
	}
	
	synchronized void printSecond() throws InterruptedException
	{
		for(int i=1; i<=3; i++)
		{
			while(!second)
			{
				wait();
			}
			IO.println(num++);
			second = false;
			third = true;
			notifyAll();
		}
	}
	
	synchronized void printThird() throws InterruptedException
	{
		for(int i=1; i<=3; i++)
		{
			while(!third)
			{
				wait();
			}
			IO.println(num++);
			third = false;
			first = true;
			notifyAll();
		}
	}
	

}
