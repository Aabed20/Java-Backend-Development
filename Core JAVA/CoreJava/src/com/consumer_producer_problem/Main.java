package com.consumer_producer_problem;

public class Main 
{
	public static void main(String[] args)
	{
	  SharedData sd = new SharedData();
	  
	  Thread consumer = new Thread(()->{
		 sd.consume(); 
	  });
      Thread producer = new Thread(()->{
    	  sd.produce(10);
      });
      consumer.start();
      producer.start();
      
      
	}
	
  
}
