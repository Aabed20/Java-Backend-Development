package com.notification_service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 
{
	public static void main(String[] args) 
	{
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.getEnvironment()
		.setActiveProfiles("sms");
		
		context.register(NotificationConfig.class);
		
		context.refresh();
		
		SmsNotification bean = context.getBean(SmsNotification.class);
		
		bean.sendNotification();
	}

}
