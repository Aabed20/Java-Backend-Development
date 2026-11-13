package com.online_banking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/online_banking/application-context.xml");
		
		BankCustomer bean = context.getBean("customer", BankCustomer.class);
		
		System.out.println(bean);
	}

}
