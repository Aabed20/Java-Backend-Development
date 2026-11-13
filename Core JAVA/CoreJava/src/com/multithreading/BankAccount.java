package com.multithreading;

public class BankAccount 
{
	private double balance = 1000;
	
	synchronized void deposit(double amount)
	{
		
		balance +=amount;
		IO.println(amount+" Amount deposited Successfully!!!\nAvailable balance is "+balance);
		notify();
		
	}
	
	synchronized void withdraw(double amount) throws InterruptedException
	{
		while(amount>balance)
		{
				wait();	
		}
		balance -=amount;
		IO.println(amount+" Successfully Withdraw!!! \nRemainig Balance is : "+balance);
	    notify();
	}

}
