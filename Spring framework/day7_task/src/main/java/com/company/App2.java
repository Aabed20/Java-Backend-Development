package com.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/company/application-context.xml");

		Company bean = context.getBean("company", Company.class);
		
		System.out.println(bean);
	}

}
