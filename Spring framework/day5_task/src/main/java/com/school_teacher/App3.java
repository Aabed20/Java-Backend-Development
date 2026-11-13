package com.school_teacher;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/school_teacher/application-context.xml");

		Object bean = context.getBean("school", SchoolClass.class);
		System.out.println(bean);
		
	}

}
