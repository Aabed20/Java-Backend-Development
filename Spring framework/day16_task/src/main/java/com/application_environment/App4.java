package com.application_environment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App4 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.getEnvironment()
		.setActiveProfiles("prod");
		
		context.register(ApplicationConfig.class);
		
		context.refresh();
		ProductionEnvironment bean = context.getBean(ProductionEnvironment.class);
 
		bean.displayEnvironment();
	}

}
