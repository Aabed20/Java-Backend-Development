package com.database_environment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.getEnvironment().setActiveProfiles("mysql");
		
		context.register(DatabaseConfig.class);
		
		context.refresh();
		
		MySQLDatabase bean = context.getBean(MySQLDatabase.class);
		
		bean.connect();
	}

}
