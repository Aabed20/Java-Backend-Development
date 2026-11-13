package com.multithreading;

public class EvenOdd 
{
	private boolean evenTurn = false;
	
	synchronized void Even() throws InterruptedException
	{
		int num = 2;
		for(int i=1; i<=10; i++)
		{
			while(!evenTurn)
			{
				wait();
			}
			IO.println(num);
			num+=2;
			evenTurn = false;
			notifyAll();;
		}
	}
	
	synchronized void Odd() throws InterruptedException
	{
		int num = 1;
		for(int i=1; i<=10; i++)
		{
			while(evenTurn)
			{
				wait();
			}
			IO.println(num);
			num+=2;
			evenTurn = true;
			notifyAll();
		}
	}

}
