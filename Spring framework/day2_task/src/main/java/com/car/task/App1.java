package com.car.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 
{
	public static void main(String[] args)
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/car/task/application-context.xml");
		
		Car bean = context.getBean("car", Car.class);
		 
		bean.display();
	}

}
