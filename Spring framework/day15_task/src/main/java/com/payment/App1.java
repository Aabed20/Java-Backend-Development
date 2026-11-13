package com.payment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1 
{
	public static void main(String[] args) 
	{
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		
		context.getEnvironment().setActiveProfiles("production");
		
		context.register(ProductionPayment.class,TestPayment.class);
		
		context.refresh();
		
		Payment bean = context.getBean(Payment.class);
		
		bean.pay();
		
	}

}
