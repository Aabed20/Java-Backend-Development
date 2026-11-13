package com.gaming;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4
{
	public static void main(String[] args) 
	{
          ApplicationContext context = new ClassPathXmlApplicationContext("com/gaming/application-context.xml");

          GamingTournament bean = context.getBean("gaming", GamingTournament.class);
          
          System.out.println(bean);
	}

}
