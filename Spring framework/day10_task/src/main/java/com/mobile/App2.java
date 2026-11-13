package com.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mobile/application-context.xml");

		MobilePhone bean = context.getBean( MobilePhone.class);
		
		System.out.println(bean);
	}

}
