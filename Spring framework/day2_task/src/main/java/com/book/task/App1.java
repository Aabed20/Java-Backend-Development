package com.book.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/book/task/application-context.xml");
		
		Book bean = context.getBean("book", Book.class);
		
		bean.display();
	}

}
