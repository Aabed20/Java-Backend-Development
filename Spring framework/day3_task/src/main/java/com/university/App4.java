package com.university;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4
{

public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("com/university/application-context.xml");
	
	Student bean = context.getBean("student", Student.class);
	
	System.out.println(bean);
}
}
