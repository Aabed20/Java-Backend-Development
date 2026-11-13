package com.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3{

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/car/application-context.xml");

		Car bean = context.getBean("car", Car.class);
		
		System.out.println(bean);
	}

}
