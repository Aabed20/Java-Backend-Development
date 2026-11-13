package com.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/student/application-context.xml");

		Student bean = context.getBean("student", Student.class);
		
		System.out.println(bean);
	}

}
