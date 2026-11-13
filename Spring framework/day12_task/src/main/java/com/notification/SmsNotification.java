package com.notification;

public class SmsNotification implements NotificationService {

	@Override
	public void sendNotification() 
	{
		System.out.println("Sms Notification");
		
	}

}
