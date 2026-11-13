package com.railway;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/railway/application-context.xml");

		RailwayCoach bean = context.getBean("railway",RailwayCoach.class);
		
		System.out.println(bean);
	}

}
