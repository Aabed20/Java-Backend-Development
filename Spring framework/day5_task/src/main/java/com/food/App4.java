package com.food;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/food/application-context.xml");

		FoodOrder bean = context.getBean("food", FoodOrder.class);
		
		System.out.println(bean);
	}

}
