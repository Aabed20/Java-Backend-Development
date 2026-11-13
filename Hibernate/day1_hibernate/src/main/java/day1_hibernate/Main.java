package day1_hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("Hello hibernate");
		Configuration config = new Configuration();
		config.configure("day1_hibernate/hibernate-cnf.xml");
		
		
		SessionFactory factory = config.buildSessionFactory();
		
		System.out.println(factory);

	}

}
