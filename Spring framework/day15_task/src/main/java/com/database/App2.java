package com.database;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.getEnvironment().setActiveProfiles("production");
		
		context.register(DevelopmnetDatabase.class,ProductionDatabase.class);
		
		context.refresh();
		
		DatabaseConnectivity bean = context.getBean(DatabaseConnectivity.class);
		
		bean.connect();
	}

}
