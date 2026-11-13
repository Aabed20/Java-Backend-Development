package com.aabed.Interface;

public non-sealed class CreditCardPayment1 implements Payment
{
	private String cardHolderName;
	

	public CreditCardPayment1(String cardHolderName) {
		super();
		this.cardHolderName = cardHolderName;
	}

	@Override
	public void makePayment(double amount) 
	{
		System.out.println("Starting checkout for amount RS :"+amount);
		System.out.println("Paid RS :"+amount+" using Credit Card Holder : "+this.cardHolderName);
		
	}

	@Override
	public void makeRefund(double amount) 
	{
		System.out.println("Order Canceled. Initiating Refund...");
		System.out.println("Cancelling order for amount RS :"+amount);
		System.out.println("Refunded RS :"+amount+" to Credit Card Holder : "+this.cardHolderName);
      
		
	}

}
