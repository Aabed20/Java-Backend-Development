package com.aabed.Interface;

import java.util.Scanner;

public class Customer 
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter your total bill Amount :");
	  double amount = Double.parseDouble(sc.nextLine());
	  System.out.println("Choose Payment Method:\n1. credit card\n2. Debit card\n3. UPI");
      int choice = Integer.parseInt(sc.nextLine());
      Payment p;
      ShoppingCart scp = new ShoppingCart(amount);
      switch(choice)
      {
      case 1 ->
      {
    	  System.out.print("Enter customer Name : ");
    	  String name = sc.nextLine();
    	  p = new CreditCardPayment1(name);
    	  scp.checkout(p);
    	  System.out.println();
    	  System.out.print("Do you want to cancel the payment : ");
    	  String cancel = sc.nextLine();
    	  if(cancel.equalsIgnoreCase("yes"))
    	  {
    	  scp.cancelOrder(p);
    	  }
    	  else
    	  {
    		  System.out.println("Payment successfully Done");
    	  }
    	  
      }
      case 2 ->
      {
    	  System.out.print("Enter Bank Name : ");
    	  String bankName = sc.nextLine();
    	  p = new DebitCardPayment(bankName);
    	  scp.checkout(p);
    	  System.out.println();
    	  System.out.print("Do you want to cancel the payment : ");
    	  String cancel = sc.nextLine();
    	  if(cancel.equalsIgnoreCase("yes"))
    	  {
    	  scp.cancelOrder(p);
    	  }
    	  else
    	  {
    		  System.out.println("Payment successfully Done");
    	  }
    	  
      }
      
      case 3 ->
      {
    	  System.out.print("Enter UPI ID : ");
    	  String upiId = sc.nextLine();
    	  p = new UPIPayment(upiId);
    	  scp.checkout(p);
    	  System.out.println();
    	  System.out.print("Do you want to cancel the payment [yes/no]: ");
    	  String cancel = sc.nextLine();
    	  if(cancel.equalsIgnoreCase("yes"))
    	  {
    	  scp.cancelOrder(p);
    	  }
    	  else
    	  {
    		  System.out.println("Payment successfully Done");
    	  }
    	  
      }
 
      }
	  
	}

}
