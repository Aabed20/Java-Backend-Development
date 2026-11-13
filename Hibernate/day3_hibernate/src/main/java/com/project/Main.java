package com.project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main 
{
	public static void main(String[] args) 
	{
      Configuration cnf = new Configuration();
      
      cnf.configure("com/project/hibernate-cnf.xml");
      
      SessionFactory factory = cnf.buildSessionFactory();
      
      Employee emp = new Employee();
      
      emp.setName("Asta");
      
      emp.setAddress("Clover Kingdom");
      
      emp.setCompanyName("Black Bulls");
      
      emp.setHrEmail("blackbulls@gmail.com");
      
      emp.setJoiningDate(LocalDate.of(2020, 10, 29));
      
      emp.setProjectAssignmentDateAndTime(LocalDateTime.of(2020, 11, 01, 10, 0));
      
      emp.setProjectSubmissionDateAndTime(LocalDateTime.of(2021, 5, 01, 10, 0));
      
      Path path = Paths.get("C:\\Users\\Aabed pathaan\\OneDrive\\Desktop\\Spring JDBC\\asta.jpeg");
      
      try {
		byte[] allBytes = Files.readAllBytes(path);
		emp.setEmployeeImage(allBytes);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
      
      Session session = factory.openSession();
      
      Transaction transaction = session.beginTransaction();
      
      session.persist(emp);
      
      System.out.println("Successfully mapped the data to database");
      
      transaction.commit();
      
      session.close();
      
      Session session2 = factory.openSession();
      
      Employee emp2 = session2.get(Employee.class, 1);
      if(emp2==null)
      {
    	  System.out.println("Employee not found!!!");
    	  System.exit(0);
      }
      
      System.out.println("Successfully fetched the data");
      
      byte[] byte2 = emp2.getEmployeeImage();
      
      Path path2 = Paths.get("C:\\Users\\Aabed pathaan\\OneDrive\\Desktop\\Spring JDBC\\blackclover.jpeg");
      
      try 
      {  
		Files.write(path2, byte2);
		System.out.println("The image is successfully saved to the path , Go & check");
	  } 
      catch (IOException e) 
      {
		e.printStackTrace();
	}

	}

}
