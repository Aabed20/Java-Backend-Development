package com.payment_service;

public class CreditCardPayment implements PaymentService {

	@Override
	public void makePayment() 
	{
		System.out.println("Payment done using Credit card");
		
	}

}
