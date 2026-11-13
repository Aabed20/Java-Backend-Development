package com.food_delivery;

import org.springframework.stereotype.Component;

@Component("card")
public class CardPaymentService implements PaymentService 
{
	@Override
	public void doPayment() 
	{
		System.out.println("Payment done using Card ");

	}
}
