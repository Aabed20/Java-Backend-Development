package com.multithreading;

public class PrintABCDemo 
{
	public static void main(String[] args) 
	{
		PrintABC p = new PrintABC();
		
		Thread a = new Thread(
				
				()->
				{
					try
					{
						p.printA();
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				
				);
           Thread b = new Thread(
				
				()->
				{
					try
					{
						p.printB();
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				
				);
      Thread c = new Thread(
		
		()->
		{
			try
			{
				p.printC();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		);
      
      a.start();
      b.start();
      c.start();
				
				

	}

}
