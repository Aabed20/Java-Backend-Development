package com.travel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext("com.travel");
		
		TravelService bean = context.getBean(TravelService.class);

		bean.travel();
	}

}
