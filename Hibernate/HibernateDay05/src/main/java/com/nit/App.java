package com.nit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.connection.ConnectionProvider;
import com.dao.OperationDao;
import com.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> data = new ArrayList<Student>();
		while(true) {
		System.out.println("press 1 for insert ");
		System.out.println("Press 2 for fecth");
		System.out.println("Press 3 for exit");

		int choice = sc.nextInt();
		
		
		switch (choice) {
		
		case 1:
			

			Student student = null;
			System.out.println("Enter how many student you want to add");
			int choice1 = sc.nextInt();

			for (int i = 1; i <= choice1; i++) {
				System.out.println("Enter the student name");
				String name = sc.next();
				System.out.println("Enter the student degree");
				String degree = sc.next();

				student = new Student();//

				student.setName(name);
				student.setDegree(degree);

				boolean b = data.add(student);

			}
			
			 String insertData = OperationDao.insertData(data);
			 System.out.println("Status :"+insertData);
			 
			break;
		case 2:
			     System.out.println(OperationDao.getData(data).size());    
			  OperationDao.getData(data)
			            .forEach(System.out::println);
			       
			break;
		case 3:
			System.out.println("Thanks for using this app!");
			System.exit(0);
			break;
		default:
			break;

		}
		}

	}
}
