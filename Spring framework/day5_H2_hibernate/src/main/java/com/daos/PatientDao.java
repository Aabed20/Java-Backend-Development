package com.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.models.Patient;

public class PatientDao 
{
	
	public static String insertPatient(Patient patient,SessionFactory factory)
	{
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(patient);
		return "Patient Inserted Successfully";
	}

}
