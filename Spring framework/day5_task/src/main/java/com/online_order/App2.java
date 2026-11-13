package com.online_order;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2
{

	public static void main(String[] args)
	{
	   ApplicationContext context = new ClassPathXmlApplicationContext("com/online_order/application-context.xml");

	   Order bean = context.getBean("order", Order.class);
	   
	   System.out.println(bean);
	}

}
