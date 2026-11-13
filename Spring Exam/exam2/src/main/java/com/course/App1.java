package com.course;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/course/application-context.xml");

		Course bean = context.getBean("course", Course.class);
		
		System.out.println(bean);
		
	}

}
