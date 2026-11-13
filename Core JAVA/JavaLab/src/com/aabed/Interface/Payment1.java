package com.aabed.Interface;

public interface Payment1 
{
	public abstract void processPayment();
	public abstract void applyDiscount();
}
 
class CreditCardPayment implements Payment1
{

	@Override
	public void processPayment() 
	{
		System.out.println("Initiating Credit Card payment");
		System.out.println("Processing Credit Card payment...");
		
	}

	@Override
	public void applyDiscount() 
	{
		System.out.println("Applying 10% discount for Credit Card payment");
		
	}
	
}
class UPIPayment1 implements Payment1
{

	@Override
	public void processPayment() 
	{
		System.out.println("Initiating UPI payment");
		System.out.println("Processing UPI payment...");
		
	}

	@Override
	public void applyDiscount() 
	{
		System.out.println("Applying 5% discount for UPI payment");
		
	}
	
}


