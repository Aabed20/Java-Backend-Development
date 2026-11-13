package com.components;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevelopmentNotificationService implements NotificationService
{

	@Override
	public void sendNotification() 
	{
		System.out.println("Test Notification message");
		
	}

}
