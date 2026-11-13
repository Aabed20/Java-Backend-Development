package com.laptop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App5
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/laptop/application-context.xml");

		Laptop bean1 = context.getBean("laptop", Laptop.class);
		
		Laptop bean2 = context.getBean("laptop1", Laptop.class);
		
		System.out.println(bean1);
		System.out.println(bean2);
	}

}
