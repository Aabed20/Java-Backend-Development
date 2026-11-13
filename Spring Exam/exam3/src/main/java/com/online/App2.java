package com.online;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext("com.online");

		OrderDelivery bean = context.getBean(OrderDelivery.class);
		
		bean.deliver();
	}

}
