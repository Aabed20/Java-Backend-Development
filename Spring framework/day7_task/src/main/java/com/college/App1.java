package com.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/college/application-context.xml");

		College bean = context.getBean("college", College.class);
		
		System.out.println(bean);
	}

}
