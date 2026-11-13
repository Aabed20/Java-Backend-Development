package com.bankaccount.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bankaccount/task/application-context.xml");
		
		BankAccount bean = context.getBean("bankAccount", BankAccount.class);
       System.out.println(bean);
	}

}
