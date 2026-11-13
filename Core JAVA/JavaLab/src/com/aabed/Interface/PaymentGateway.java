package com.aabed.Interface;

public class PaymentGateway
{

	public Payment1 initiatePayment(String paymentType)
	{
		if(paymentType.equalsIgnoreCase("CreditCard"))
		{
			return new CreditCardPayment();
			
		}
		else if(paymentType.equalsIgnoreCase("UPI"))
		{
			return new UPIPayment1();
		}
		else
		{
			return null;
		}
	
	}

}
