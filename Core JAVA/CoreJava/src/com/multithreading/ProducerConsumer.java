package com.multithreading;

public class ProducerConsumer 
{
	private int item = 0;
	private boolean isAvailable = false; 

	
	synchronized void produce() throws InterruptedException
	{
		for(int i=1; i<=3; i++)
		{
		while(isAvailable)
		{
			wait();
		}
		item++;
		IO.println("Producer produced "+item);
		if(item>=3)
		{
		isAvailable = true;
		notify();
		}
		}
	}
	
	synchronized void consume() throws InterruptedException
	{
		for(int i=1; i<=3; i++)
		{
		while(!isAvailable)
		{
			wait();
		}
		
		item--;
		
		if(item==0)
		{
			isAvailable = false;
			notify();
		}
	}
	}
	
}
