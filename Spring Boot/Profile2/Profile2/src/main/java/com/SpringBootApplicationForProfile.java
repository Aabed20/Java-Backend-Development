package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.components.NotificationService;

@SpringBootApplication
public class SpringBootApplicationForProfile 
{
	
	
	public static void main(String[] args) 
	{
		 ApplicationContext run=SpringApplication.run(SpringBootApplicationForProfile.class);
		
		NotificationService service = run.getBean(NotificationService.class);
		
		service.sendNotification();
	}

	

}
