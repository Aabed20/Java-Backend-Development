package com.food_delivery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/food_delivery/application-context.xml");
		
		FoodOrder bean = context.getBean(FoodOrder.class);
		
		bean.getPaymentService().doPayment();
	}

}
