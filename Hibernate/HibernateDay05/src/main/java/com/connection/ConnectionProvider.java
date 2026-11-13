package com.connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionProvider {

	 private static SessionFactory factory=null;
	 
	 private ConnectionProvider() {
		 
	 }
	 
	 public static SessionFactory getConnection() {
		  if(factory==null)
		  {
			  Configuration configuration=
		        		 new Configuration();
		        configuration.configure("resource/hibernate-cnf.xml");
		        factory=configuration.buildSessionFactory();
			  
		  }
		  return factory;
	 }
	 
}
