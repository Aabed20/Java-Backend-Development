package com.smart_agriculture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/smart_agriculture/application-context.xml");

		IrrigationController bean = context.getBean(IrrigationController.class);
		
		bean.display();
		
	}

}
