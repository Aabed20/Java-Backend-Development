package com.nit;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.daos.PatientDao;
import com.models.Address;
import com.models.Patient;

public class App 
{
	public static void main(String[] args) 
	{
		Server webServer=null;
		try 
		{
			webServer = Server.createWebServer(
					 "-web", "-webPort", "8085"
					 ).start();
		}
		catch (SQLException e) 
		{	
			e.printStackTrace();
		}
		     SessionFactory factory = new Configuration()
				 .configure("com/resources/hibernate-cnf.xml")
				 .buildSessionFactory();
           
		     Patient p = new Patient();
		     p.setFullName("Aabed");
		     p.setEmail("aabed@gmail.com");
		     
		     p.setPhoneNumber(7558665939l);
		     
		     Address ad = new Address();
		     ad.setStreet("Yella reddy");
		     ad.setCity("hyd");
		     ad.setPincode(500016);
		     ad.setState("Telangana");
		     p.setAddress(ad);
		     
		     String insertPatient = PatientDao.insertPatient(p, factory);
		     System.out.println(insertPatient);
				// webServer.stop();
	 }				 
}
