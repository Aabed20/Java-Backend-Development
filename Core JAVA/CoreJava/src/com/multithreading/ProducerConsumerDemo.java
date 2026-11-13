package com.multithreading;

public class ProducerConsumerDemo
{
	public static void main(String[] args) 
	{
		ProducerConsumer pc = new ProducerConsumer();
		
		Thread consumer = new Thread(
				()->
				{
					try {
						pc.consume();
					} catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
				}
				);
		
		Thread producer = new Thread(
				()->
				{
					try
					{
						pc.produce();
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				
				);
				
		consumer.start();
		producer.start();

	}

}
