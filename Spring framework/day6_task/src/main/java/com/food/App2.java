package com.food;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/food/application-context.xml");

		Restaurant bean = context.getBean("restaurant", Restaurant.class);
		
		System.out.println(bean);
	}

}
