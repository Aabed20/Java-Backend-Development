package com.multithreading;

public class BankAccountDemo 
{
	public static void main(String[] args) 
	{
		BankAccount a = new BankAccount();
		
		Thread depositThread = new Thread(
				()->
				{
					a.deposit(500);
					
					a.deposit(1000);	
				}
			
				);
		Thread withdrawThread = new Thread(
				()->
				{
					try {
						a.withdraw(1000);
						a.withdraw(1500);
					} catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
				}
				);
		withdrawThread.start();
		depositThread.start();
		

	}

}
