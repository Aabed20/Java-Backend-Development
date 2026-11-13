package com.product.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/product/task/application-context.xml");

		Product bean = context.getBean("product", Product.class);
		
		System.out.println(bean);
	}

}
