package com.payment_service;

public class UpiPayment implements PaymentService {

	@Override
	public void makePayment() 
	{
		System.out.println("Payment done using UPI");
		
	}

}
