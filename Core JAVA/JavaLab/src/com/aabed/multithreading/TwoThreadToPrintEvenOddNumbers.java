package com.aabed.multithreading;

class EvenThread extends Thread
{
	@Override
	public void run()
	{
		IO.println("Thread Name is : "+Thread.currentThread().getName());

		for(int i=1; i<=100; i++)
		{
			if(i%2==0)
			IO.println(i+" by "+Thread.currentThread().getName());
		}
	}
}

class OddThread extends Thread
{
	@Override
	public void run()
	{
		IO.println("Thread Name is : "+Thread.currentThread().getName());

		for(int i=1; i<=100; i++)
		{
			if(i%2==1)
			IO.println(i+" by "+Thread.currentThread().getName());
		}
	}
}
public class TwoThreadToPrintEvenOddNumbers
{
	public static void main(String[] args)
	{
		EvenThread et = new EvenThread();
		OddThread ot = new OddThread();
		
		et.setName("Even-Thread");
		ot.setName("Odd-Thread");
		try
		{
		et.start();
		et.join();
		ot.start();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}

	}

}
