package com.movie_ticket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/movie_ticket/application-context.xml");
		
		MovieTicket bean1 = context.getBean("movie", MovieTicket.class);
		
		MovieTicket bean2 = context.getBean("movie", MovieTicket.class);
		
		bean1.setTicketId(101); bean1.setMovieName("Toxic");
		bean1.setCustomerName("Aabed");bean1.setSeatNumber("J123");
		
		bean2.setTicketId(102);bean2.setMovieName("RRR");
		bean2.setCustomerName("Rahil"); bean2.setSeatNumber("J124");
		
		System.out.println(bean1.hashCode()+" "+bean2.hashCode());
		
		System.out.println(bean1);
		System.out.println(bean2);

	}

}
