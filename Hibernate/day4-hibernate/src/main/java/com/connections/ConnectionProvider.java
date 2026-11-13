package com.connections;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionProvider 
{
	public static SessionFactory factory = null;
	
	public static SessionFactory getConnection()
	{
		if(factory==null)
		{
			Configuration config = new Configuration();
			config.configure("com/resources/hibernate-cnf.xml");
			
			 factory = config.buildSessionFactory();
			 
			 return factory;
		}
		
		return factory;
	}

}
