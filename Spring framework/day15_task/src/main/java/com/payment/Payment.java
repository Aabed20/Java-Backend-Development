package com.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Payment 
{
	@Autowired
	PaymentService paymentService;
	
	public void pay()
	{
		paymentService.payment();
	}

}
