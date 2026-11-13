package com.notification;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3 
{
	public static void main(String[] args) 
	{
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
       context.getEnvironment().setActiveProfiles("email");
       
       context.register(EmailNotification.class,SmsNotification.class);
       
       context.refresh();
       
       Notification bean = context.getBean(Notification.class);
		
       bean.getNotification();
	}
}