package com.food_delivery;

import org.springframework.stereotype.Component;

@Component("upi")
public class UpiPaymentService implements PaymentService
{
	@Override
	public void doPayment() 
	{
		System.out.println("Payment done using upi mode");
		
	}

}
