package com.daos;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connections.ConnectionProvider;
import com.entity.Loan;

public class LoanDao 
{


	public static String insertLoan(Loan loan)
	{
		Session session = ConnectionProvider.getConnection().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.persist(loan);
		transaction.commit();
		session.close();
		
		return "The loan is inserted into the database with an automatically generated ID";
	}
	
	public static Loan retriveLoanById(int id)
	{
		Loan loan = null;
		
		Session session = ConnectionProvider.getConnection().openSession();
		Transaction transaction = session.beginTransaction();
		
		try
		{
		loan = session.getReference(Loan.class,id);
		loan.toString();
		}
		catch(Exception e)
		{
			System.out.println("Loan with id "+id+" does not exist");
			return null;
		}
		
		return loan;
	}
	
	public static List<Loan> retrieveAllLoans()
	{
		List<Loan> loanList = new ArrayList<>();
		
		Session session = ConnectionProvider.getConnection().openSession();
		
		Transaction transaction = session.beginTransaction();
		
	    loanList = session.createSelectionQuery("FROM Loan",Loan.class).getResultList();
		
		if(loanList.size()==0)
		{
			
			return null;
		}
		
		return loanList;
	}
	
	public static String updateLoan(int id,String status,double interestRate)
	{
		Session session = ConnectionProvider.getConnection().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		try
		{
		 Loan loan = session.getReference(Loan.class,id);
		
		 if(loan.getCreditScore()>=700)
		 {
			 loan.setLoanStatus(status);
			 loan.setInterestRate(interestRate);
		 }
		 
		 transaction.commit();
		 session.close();
		 return "Loan Updated Successfully";
		}
		catch(Exception e)
		{
			System.out.println("No Loan Record with id "+id+" found");
			return null;
		}
		
	}
	
	public static String deleteLoan(int id)
	{
		Session session = ConnectionProvider.getConnection().openSession();
		Transaction transaction = session.beginTransaction();
		try
		{
		  	Loan loan = session.getReference(Loan.class,id);
			
		  	session.remove(loan);
		  	transaction.commit();
		  	session.close();
		}
		catch(Exception e)
		{
			System.out.println("No Loan Record with id "+id+" found");
			return null;
		}
		
		return "Loan Deleted successfully";
	}

}
