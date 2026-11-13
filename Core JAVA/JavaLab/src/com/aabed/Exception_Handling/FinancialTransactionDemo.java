package com.aabed.Exception_Handling;

class FinancialTransaction
{
	public void processTransaction(double a, long b)
	{
		try
		{
			if(a<=0)
			{
				throw new IllegalArgumentException();
			}
			IO.println("Processing transaction...");
			IO.println("Transaction successful: Amount Rs."+a+" transferred to account "+b);
			
		}
		catch(IllegalArgumentException e)
		{
			IO.println("Error processing transaction: Transaction amount must be positive.");
		}
		catch(RuntimeException e)
		{
			IO.println("Invalid input: Please enter a valid number for transaction amount.");
		}
	}
}



public class FinancialTransactionDemo
{
	public static void main(String[] args)
	{
	  try
	  {
		  FinancialTransaction ft = new FinancialTransaction();
		  double amount = Double.parseDouble(IO.readln("Enter Transaction Amount : "));
		  long acno = Long.parseLong(IO.readln("Account Number : "));
		  ft.processTransaction(amount, acno);
	  }
	  catch(NumberFormatException e)
	  {
		  IO.println("Invalid input: Please enter a valid number for transaction amount.");
	  }

	}

}
