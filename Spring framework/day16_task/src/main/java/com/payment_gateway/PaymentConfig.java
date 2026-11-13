package com.payment_gateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class PaymentConfig 
{
	@Bean
	@Profile("upi")
	public UPIPayment upipayment()
	{
		UPIPayment upi = new UPIPayment();
		return upi;
	}
	
	@Bean
	@Profile("card")
	public CardPayment cardpayment()
	{
		CardPayment card = new CardPayment();
		return card;
	}

}
