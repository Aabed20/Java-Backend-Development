package com.course;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App4 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext("com.course");

		Course bean = context.getBean(Course.class);
		
		bean.joinCourse();
	}

}
