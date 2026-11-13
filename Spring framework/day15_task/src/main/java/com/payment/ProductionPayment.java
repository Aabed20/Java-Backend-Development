package com.payment;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.payment")
@Profile("production")
public class ProductionPayment extends PaymentService 
{
	@Override
	public void payment() 
	{
		System.out.println("Payment is running in PRODCUTION environment");

	}

}
