package com.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(ShoppingConfiguration.class);

		Shopping bean = context.getBean(Shopping.class);
		
		bean.paymentVerification();
		
	}

}
