package com.hospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1
{
	public static void main(String[] args)
	{
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hospital/application-context.xml");
	
		Hospital bean = context.getBean("hospital", Hospital.class);
		
		System.out.println(bean);
	}

}
