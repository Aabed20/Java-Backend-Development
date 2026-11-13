package com.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.food")
public class OrderProcessing 
{
	@Value("200")
	private double amount;
	@Autowired
	@Qualifier("upi")
	PaymentService paymentService;
	
	public void doPayment()
	{
		System.out.println("Amount : "+amount);
		paymentService.pay();
		System.out.println("Mode of Payment :"+paymentService);
	}
	
	

}
