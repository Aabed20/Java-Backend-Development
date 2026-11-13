package com.hospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App5
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext("com/hospital");
      
		Doctor bean = context.getBean(Doctor.class);
		
		System.out.println(bean);
	}

}
