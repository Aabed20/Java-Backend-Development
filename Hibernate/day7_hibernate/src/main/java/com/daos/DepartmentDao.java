package com.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.connections.ConnectionProvider;
import com.entities.Department;
import com.entities.Doctor;

public class DepartmentDao 
{
	public static void removeDoctor(int id)
	{
       SessionFactory factory = ConnectionProvider.getConnection();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Doctor doctor = session.get(Doctor.class, id);
		
		System.out.println(doctor.getDoctorName()+" "+doctor.getSpecialization()+" "+doctor.getSalary()+" "
				+doctor.getDepartment().getDepartmentName());
		
		session.remove(doctor);
		
       transaction.commit();
		
		session.close();
		
		System.out.println("Doctor Removed Successfully");
	}
	
	public static void insertData(Department departement)
	{
		
		SessionFactory factory = ConnectionProvider.getConnection();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.persist(departement);
      
		transaction.commit();
		
		session.close();
		
		System.out.println("Record are inserted successfully");
	}
	
	public static void updateDoctor(int id,String specialization,double salary)
	{
       SessionFactory factory = ConnectionProvider.getConnection();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Doctor doctor = session.get(Doctor.class, id);
		 
		doctor.setSpecialization(specialization);
		doctor.setSalary(salary);
		
		transaction.commit();
		session.close();
		
		System.out.println("Doctor Record updated Successfully");
	}
	
	public static void getDoctorRecord(int id)
	{
      SessionFactory factory = ConnectionProvider.getConnection();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Doctor doctor = session.get(Doctor.class, id);
		 
		System.out.println("Doctor Id : "+doctor.getDoctorId());
		System.out.println("Doctor Name : "+doctor.getDoctorName());
		System.out.println("Doctor Specialization : "+doctor.getSpecialization());
		System.out.println("Doctor Salary : "+doctor.getSalary());
		System.out.println("Department : "+doctor.getDepartment().getDepartmentName());
		transaction.commit();
		session.close();
	}

}
