package com.notification;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.notification")
@Profile("email")
public class EmailNotification extends NotificationService
{
	@Override
	public void notification() 
	{
		System.out.println("Email Notification is active");
		
	}
	

}
