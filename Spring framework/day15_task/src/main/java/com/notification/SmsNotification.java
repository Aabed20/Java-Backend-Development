package com.notification;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.notification")
@Profile("sms")
public class SmsNotification extends NotificationService 
{
	@Override
	public void notification() 
	{
		System.out.println("SMS Notification is Active");

	}

}
