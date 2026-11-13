package com.payment_gateway;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.getEnvironment().setActiveProfiles("card");
		
		context.register(PaymentConfig.class);
		
		context.refresh();
		
		CardPayment bean = context.getBean(CardPayment.class);
		
		bean.payment();
	}

}
