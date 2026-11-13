package com.aabed.method_overriding;

import java.util.Scanner;

class Payment
{
  public void processPayment()
  {
	  System.out.println("Generic Processing payment");
  }
}

class CreditCardPayment extends Payment
{
	@Override
	public void processPayment()
	  {
		  System.out.println("Processing credit card payment");
	  }
	
}
class DebitCardPayment extends Payment
{
	@Override
	public void processPayment()
	  {
		  System.out.println("Processing Debit card payment");
	  }
	
}
class UPI extends Payment
{
	@Override
	public void processPayment()
	  {
		  System.out.println("Processing UPI payment");
	  }
	
}
public class PaymentProcessing 
{
	public static void main(String[] args)
	{
		Payment p[] = new Payment[3];
		 p[0]= new CreditCardPayment();
		
		p[1] = new DebitCardPayment();
     	
		p[2] = new UPI();
		paymentGateway(p);
		
	}
	public static void paymentGateway(Payment ...payments)
	{
      for(Payment payment:payments)
      {
    	  payment.processPayment();
    	  
      }	
	}
}
