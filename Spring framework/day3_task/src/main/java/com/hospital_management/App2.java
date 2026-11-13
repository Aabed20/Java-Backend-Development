package com.hospital_management;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2
{

	public static void main(String[] args)
	{
		 ApplicationContext context = new ClassPathXmlApplicationContext("com/hospital_management/application-context.xml");
		 
		 Doctor bean = context.getBean("doctor", Doctor.class);
		 System.out.println(bean);
	}
}
