package com.cloud_storage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App5
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.getEnvironment()
		.setActiveProfiles("google");
		
		context.register(CloudConfig.class);
		
		context.refresh();
		
		GoogleCloudeStorage bean = context.getBean(GoogleCloudeStorage.class);
		
		bean.activeStorage();
	}

}
