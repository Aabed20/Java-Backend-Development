package com.consumer_producer_problem;

public class SharedData 
{
	int value;
	boolean isAvailable= false;
	
	synchronized void produce(int value)
	{
		while(isAvailable)
		{
			try {
				wait();
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		
		this.value = value;
		isAvailable = true;
		IO.println("Produced : "+value);
		notify();
		IO.println("Notified consumer ");
	}
	
	synchronized void consume()
	{
		while(!isAvailable)
		{
		try 
		{
			wait();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}	
		IO.println("Consumed : "+value);
		isAvailable = false;
		notify();
		IO.println("Notified Producer");
		
		}
	}

}
