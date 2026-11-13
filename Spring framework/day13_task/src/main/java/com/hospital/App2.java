package com.hospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hospital/application-context.xml");

		PatientRecord bean = context.getBean("patientRecord", PatientRecord.class);
		
		bean.displayData();
	}

}
