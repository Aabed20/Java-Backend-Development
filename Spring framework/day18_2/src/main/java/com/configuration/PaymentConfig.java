package com.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.beans.PaymentService;

@Configuration
@ComponentScan("com.beans")
@PropertySource("resources/application.properties")
public class PaymentConfig 
{
	@Autowired
	private Environment env;
	
	@Bean
	public PaymentService paymentService()
	{
		PaymentService paymentService = new PaymentService();
		paymentService.setPaymentMode(env.getProperty("payment.mode"));
		paymentService.setPaymentCurrency(env.getProperty("payment.currency"));
		
		return paymentService;
	}

}
