package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.beans.AppointmentNotificationService;

@Configuration
@ComponentScan("com.beans")
public class HospitalConfig 
{
	
	@Bean
	public AppointmentNotificationService appointmentNotificationService()
	{
		AppointmentNotificationService service = new AppointmentNotificationService();
		return service;
	}

}
