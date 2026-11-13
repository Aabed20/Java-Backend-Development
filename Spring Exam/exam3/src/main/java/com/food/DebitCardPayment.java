package com.food;

import org.springframework.stereotype.Component;

@Component("debit")
public class DebitCardPayment implements PaymentService {

	@Override
	public void pay() 
	{
		System.out.println("Payment done using debit card");

	}
	
	public String toString()
	{
		return "Debit Card";
	}

}
