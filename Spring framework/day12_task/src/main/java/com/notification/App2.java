package com.notification;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/notification/application-context.xml");

		NotificationManager bean = context.getBean(NotificationManager.class);
		
		bean.getNotificationService().sendNotification();
	}

}
