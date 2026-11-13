package com.aabed.multithreading;


class MyThread extends Thread
{
	@Override
	public void run()
	{
		IO.println("Odd Numbers are : ");
		for(int i=0; i<100; i++)
		{
			if(i%2==1)
			{
				IO.println(i+" by "+Thread.currentThread().getName());
			}
		}
	}
}

public class PrintEvenAndOddNumbers 
{
	public static void main(String[] args)
	{
	 MyThread m1 = new MyThread();
	 m1.start();
	 try
	 {
	 m1.join();
	 }
	 catch(InterruptedException e)
	 {
		 e.printStackTrace();
	 }
	 IO.println("========================");
	 IO.println("Even Number are : ");
	 for(int i=1; i<=100; i++)
		{
			if(i%2==0)
			{
				IO.println(i+" by "+Thread.currentThread().getName());
			}
		}

	}

}
