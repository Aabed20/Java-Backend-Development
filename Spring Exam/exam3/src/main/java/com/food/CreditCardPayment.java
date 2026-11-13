package com.food;

import org.springframework.stereotype.Component;

@Component("credit")
public class CreditCardPayment implements PaymentService {

	@Override
	public void pay() 
	{
		System.out.println("Payment done using Credit card");
		

	}
	
	public String toString()
	{
		return "Credit card";
	}

}
