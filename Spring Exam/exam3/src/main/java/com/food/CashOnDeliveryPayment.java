package com.food;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("cash")
public class CashOnDeliveryPayment implements PaymentService {

	@Override
	public void pay() 
	{
		System.out.println("Payment done using Cash");

	}
	
	public String toString()
	{
		return "Cash ";
	}

}
