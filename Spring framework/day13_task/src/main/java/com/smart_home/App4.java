package com.smart_home;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/smart_home/application-context.xml");
		
		SmartHomeCotroller bean = context.getBean("smart", SmartHomeCotroller.class);
		
		bean.displayData();
	}

}
