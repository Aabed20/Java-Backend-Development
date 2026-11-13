package com.bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App5
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bank/application-context.xml");
		
		BankAccount bean = context.getBean("bank", BankAccount.class);
		
		System.out.println(bean);
		
	}

}
