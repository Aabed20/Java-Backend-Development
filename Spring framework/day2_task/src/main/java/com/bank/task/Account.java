package com.bank.task;

public class Account
{
  private int accountNumber;
  private String customerName;
  private double balance;
  
  public Account(int accountNumber,String customerName,double balance)
  {
	  this.accountNumber = accountNumber;
	  this.customerName = customerName;
	  this.balance = balance;
  }
	
  public int getAccountNumber()
  {
	  return this.accountNumber;
  }
	
  public String getCustomerName()
  {
	  return this.customerName;
  }
  
  public double getBalance()
  {
	  return this.balance;
  }
  
  public void display()
  {
	  System.out.println("Bank Account Details :\nAccount Number : "+this.accountNumber);
	  System.out.println("Customer Name : "+this.customerName);
	  System.out.println("Balance : "+this.balance);
  }
	
}
