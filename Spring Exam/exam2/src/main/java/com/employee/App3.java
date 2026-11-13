package com.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/employee/application-context.xml");

		Employee bean = context.getBean("employee", Employee.class);
		
		System.out.println(bean);
		
		long count = bean.getProjects()
		.stream()
		.count();
		
		System.out.println("Total Projects Assigned to Employee : "+bean.getEmpName()+" = "+count);
		
	}

}
