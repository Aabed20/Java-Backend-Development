package com.nit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.AppointmentService;
import com.configuration.HospitalConfig;

public class App 
{

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HospitalConfig.class);

		AppointmentService bean = context.getBean(AppointmentService.class);
		
		bean.takeAppointment();
		
	}

}
