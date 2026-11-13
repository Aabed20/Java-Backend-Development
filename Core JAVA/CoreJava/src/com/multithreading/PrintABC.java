package com.multithreading;

public class PrintABC 
{
	private boolean aTurn = true;
	private boolean bTurn = false;
	private boolean cTurn = false;
	
	synchronized void printA() throws InterruptedException
	{
		for(int i=1; i<=3; i++)
		{
			while(!aTurn)
			{
				wait();
			}
			
			IO.print("A");
			bTurn = true;
			aTurn = false;
			notifyAll();
		}
	}
	
	synchronized void printB() throws InterruptedException
	{
		for(int i=1; i<=3; i++)
		{
			while(!bTurn)
			{
				wait();
			}
			
			IO.print("B");
			cTurn = true;
			bTurn = false;
			notifyAll();
		}
	}
	
	synchronized void printC() throws InterruptedException
	{
		for(int i=1; i<=3; i++)
		{
			while(!cTurn)
			{
				wait();
			}
			
			IO.print("C");
			aTurn = true;
			cTurn = false;
			notifyAll();
		}
	}

}
