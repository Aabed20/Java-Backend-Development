package com.online_learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext("com.online_learning");

		LearningPlatform bean = context.getBean(LearningPlatform.class);
		
		bean.display();
	}

}
