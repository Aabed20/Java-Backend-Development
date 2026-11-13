package com.online;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext("com.online");

		OnlineCourse bean = context.getBean(OnlineCourse.class);
		
		bean.displayData();
	}

}
