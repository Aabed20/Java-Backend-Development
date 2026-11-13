package com.smart_home;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/smart_home/application-context.xml");

		SmartHome bean = context.getBean("smartHome", SmartHome.class);
		
		System.out.println(bean);
	}

}
