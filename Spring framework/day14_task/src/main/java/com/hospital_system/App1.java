package com.hospital_system;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hospital_system/application-context.xml");

		RoomAllocationService bean = context.getBean(RoomAllocationService.class);
		
		bean.displayData();
		
	}

}
