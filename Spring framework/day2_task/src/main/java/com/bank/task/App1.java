package com.bank.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bank/task/application-context.xml");
        
		Account bean = context.getBean("account", Account.class);
		
		bean.display();
	}

}
