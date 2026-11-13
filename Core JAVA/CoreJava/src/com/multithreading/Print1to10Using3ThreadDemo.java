package com.multithreading;

public class Print1to10Using3ThreadDemo
{
	public static void main(String[] args) 
	{
		Print1to10Using3Thread p = new Print1to10Using3Thread();
		
		Thread first = new Thread(
				()->
				{
					try {
						p.printFirst();
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				
				);
		Thread second = new Thread(
				()->
				{
					try {
						p.printSecond();
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				
				);
		Thread third = new Thread(
				()->
				{
					try {
						p.printThird();
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				
				);
		
		   first.start();
		   second.start();
		   third.start();

	}

}
