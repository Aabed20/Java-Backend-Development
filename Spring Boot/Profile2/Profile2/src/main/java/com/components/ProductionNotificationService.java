package com.components;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProductionNotificationService implements NotificationService 
{

	@Override
	public void sendNotification() 
	{
		System.out.println("Real customer notification message");
		
	}
	

}
