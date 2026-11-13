package com.bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext("com/bank");

		BankAccount bean = context.getBean(BankAccount.class);
		
		System.out.println(bean);
	}

}
