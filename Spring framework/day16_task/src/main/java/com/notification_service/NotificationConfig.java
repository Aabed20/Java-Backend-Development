package com.notification_service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class NotificationConfig 
{
	@Bean
	@Profile("email")
	public EmailNotification emailnotification()
	{
		EmailNotification email = new EmailNotification();
		return email;
	}
	
    @Bean
    @Profile("sms")
	public SmsNotification smsnotification()
	{
		SmsNotification sms = new SmsNotification();
		return sms;
	}
}
