package com.bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bank/application-context.xml");

		Account bean = context.getBean(Account.class);
		
		System.out.println(bean);
		
	}

}
