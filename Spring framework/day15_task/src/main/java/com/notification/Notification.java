package com.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Notification 
{
	@Autowired
    NotificationService notificationService;
    
	public void getNotification()
	{
		notificationService.notification();
	}
	
	
}
