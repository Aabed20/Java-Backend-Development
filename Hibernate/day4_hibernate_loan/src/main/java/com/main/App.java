package com.main;

import java.util.List;
import java.util.Scanner;

import com.daos.LoanDao;
import com.entity.Loan;

public class App 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Add Loan");
			System.out.println("2. Retrieve a Loan by Id");
			System.out.println("3. Retrieve all loan details");
			System.out.println("4. update loan status & interest rate");
			System.out.println("5. Delete Loan Request");
			System.out.println("6. Exit");
			System.out.println("\n Enter your choice : ");
			int choice = Integer.parseInt(sc.nextLine());
			switch(choice)
			{
			case 1 :
			{   
				System.out.println("Enter Loan Details : ");
				System.out.println("\nEnter Customer Name : ");
				String name = sc.nextLine();
				System.out.println("Enter Loan Type : ");
				String loanType= sc.nextLine();
				System.out.println("Enter Loan Amount : ");
				double loanAmount = Double.parseDouble(sc.nextLine());
				if(loanAmount<=0)
				{
					System.out.println("Loan Amount cannot be less than or equal to 0");
					break;
				}
				System.out.println("Enter interesRate : ");
				double interesetRate = Double.parseDouble(sc.nextLine());
				System.out.println("Enter duration of Months : ");
				int months = Integer.parseInt(sc.nextLine());
				if(months<=0)
				{
					System.out.println("Months cannot be less than 1");
					break;
				}
				
				String status = "PENDING";
				System.out.println("Enter Credit score : ");
				int creditScore = Integer.parseInt(sc.nextLine());
				if(creditScore<300&&creditScore>900)
				{
					System.out.println("Credit Score Should not be less than 300 Or greater than 900");
					break;
				}
				
				Loan loan = new Loan();
				loan.setCustomerName(name);
				loan.setLoanType(loanType);
				loan.setLoanAmount(loanAmount);
				loan.setLoanStatus(status);
				loan.setDurationMonths(months);
				loan.setCreditScore(creditScore);
				loan.setInterestRate(interesetRate);
				
				List<Loan> allLoans = LoanDao.retrieveAllLoans();
				boolean  isduplicate = false;
				if(!(allLoans==null))
				{
				for(Loan loans : allLoans)
				{
					if(loans.getCustomerName().equals(name)&&loans.getLoanType().equals(loanType)&&loans.getLoanAmount()==loanAmount)
					{
						isduplicate = true;
						
					}
				}}
					if(!isduplicate)
					{
						String insertLoan = LoanDao.insertLoan(loan);
						System.out.println("\n"+insertLoan);
					}
					else
					{
						System.out.println("Loan Application Already Exist");
					}
				break;
			}
			case 2 :
			{
				System.out.println("Enter Id to retrieve loan Application : ");
                int id = Integer.parseInt(sc.nextLine());
                Loan loan = LoanDao.retriveLoanById(id);
                
                if(!(loan==null))
                {
                	System.out.println(loan);
                }
                break;
			}	
			case 3 :
			{
				List<Loan> allLoans = LoanDao.retrieveAllLoans();
				
				if(allLoans==null)
				{
					System.out.println("No loan Records Available");
					
				}
				else
				{
					allLoans.forEach(System.out::println);
				}
				break;
			}
				
			case 4 :
			{
				
				System.out.println("Enter Id : ");
				int id = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Updated Status : ");
				String status = sc.nextLine();
				System.out.println("Enter Updated Interest rate : ");
				double interestRate = Double.parseDouble(sc.nextLine());
				
				String updateLoan = LoanDao.updateLoan(id, status, interestRate);
				if(updateLoan==null)
				{
					break;
				}
				System.out.println(updateLoan);
				break;
			}
				
			case 5 :
			{
				System.out.println("Enter Id : ");
				int id = Integer.parseInt(sc.nextLine());
				String deleteLoan = LoanDao.deleteLoan(id);
				if(deleteLoan==null)
				{
					break;
				}
				System.out.println(deleteLoan);
				break;
			}	
			case 6 :
			{
				System.out.println("Thank you for using our Application");
				System.exit(0);
			}
				
			default :
			{
				System.out.println("Invalid Choice !!!");
				break;
			}
			
			}
			
		}
		
		
	}

}
