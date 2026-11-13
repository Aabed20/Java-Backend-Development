package com.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mobile/application-context.xml");

		Mobile bean = context.getBean("mobile", Mobile.class);
		
		System.out.println(bean);
	}

}
