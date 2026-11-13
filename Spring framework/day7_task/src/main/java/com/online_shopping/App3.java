package com.online_shopping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/online_shopping/application-context.xml");

		ShoppingCart bean = context.getBean("cart", ShoppingCart.class);
		
		bean.displayData();
		

	}

}
