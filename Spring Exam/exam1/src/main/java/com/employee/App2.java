package com.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2{

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/employee/application-context.xml");
		
		Employee bean = context.getBean("employee", Employee.class);
		
		System.out.println(bean);
	}

}
