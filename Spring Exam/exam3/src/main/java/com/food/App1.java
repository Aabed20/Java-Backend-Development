package com.food;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext("com.food");

		OrderProcessing bean = context.getBean(OrderProcessing.class);
		
		bean.doPayment();
	}

}
