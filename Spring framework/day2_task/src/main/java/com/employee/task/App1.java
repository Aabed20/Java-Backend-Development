package com.employee.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/employee/task/application-context.xml");

		Employee bean = context.getBean("employee", Employee.class);
		 
		bean.display();
	}

}
