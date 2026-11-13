package com.space;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App5
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/space/application-context.xml");

		SpaceMission bean = context.getBean("space", SpaceMission.class);
		
		System.out.println(bean);
	}

}
