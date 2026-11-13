package com.movie_booking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App5
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/movie_booking/application-context.xml");

		MovieBooking bean = context.getBean("movie", MovieBooking.class);
		System.out.println(bean);
	}

}
