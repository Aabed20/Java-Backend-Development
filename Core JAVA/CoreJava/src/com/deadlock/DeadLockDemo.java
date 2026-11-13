package com.deadlock;

public class DeadLockDemo
{
	public static void main(String[] args)
	{
        String pen = "pen";
        String book = "book";
        
        Thread t1 = new Thread(()->
        {
        	synchronized(pen) 
        	{      		
        			IO.println("Thread t1 acquired Pen");	
        			
        		synchronized(book)
        		{
        			IO.println("t1 thread got the book");
        		}
        	}
        });
        Thread t2 = new Thread(()->
        {
        	synchronized(book) 
        	{
        		IO.println("Thread t2 acquired book");
        		try {
					Thread.sleep(1000);
				} catch (InterruptedException e) 
        		{
					e.printStackTrace();
				}
        		synchronized(pen)
        		{
        			IO.println("t2 thread got pen");
        		}
        	}
        });
        
        t1.start();
        t2.start();
        t1.interrupt();

	}

}
