package com.aabed.Mini_Project;

import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class BankAccountTransactionSystem 
{
	public static void main(String[] args)
	{
		double balance = Double.parseDouble(IO.readln("Enter Opening Balance Amount : "));
		if(balance<=0)
		{
			System.err.println("Opening Balance must be positive!!!");
			System.exit(0);
		}
		Bank b1 = new Bank(balance);
		UnaryOperator<Double> deposit = (depositAmount) ->
		{
			if(depositAmount<=0)
			{
				System.err.print("Deposit Amount should be in positive\nAvailable balance is : ");
				return b1.getAccountBalance();
			}
			else
			{
			  b1.setAccountBalance(depositAmount+b1.getAccountBalance());
			  IO.print("Deposit of Amount "+depositAmount+" is Successfull\nAvailable Balance is : ");
			  return b1.getAccountBalance();
			}
		};
		
		UnaryOperator<Double> withdraw = (withrawAmount) ->
		{
			if(withrawAmount>b1.getAccountBalance()||withrawAmount<=0)
			{
				System.err.print("Withdraw Amount should be in Positive and Less Than or Equal to Balance\nAvailable Balance is : ");
				return b1.getAccountBalance();
			}
			else
			{
			  b1.setAccountBalance(b1.getAccountBalance()-withrawAmount);
			  IO.print("Amount "+withrawAmount+" withdraw Successfull\nAvailable Balance is : ");
			  return b1.getAccountBalance();
			}
		};
		
		Supplier<String> transactionId = ()->
		{
			String s = "";
			Random rand = new Random();
			s =rand.nextLong(100000000, 1000000000)+""+rand.nextLong(100000000, 1000000000);
			return s;
		};
		
		int choice = Integer.parseInt(IO.readln("Enter your Choice\n1.deposit\n2.withdraw\n "));
		if(choice==1)
		{
			Double depositAmount = Double.valueOf(IO.readln("Enter Deposit amount : "));
			IO.print(deposit.apply(depositAmount));
			if(depositAmount>0)
			{
				IO.print("\nTransaction Id is : "+transactionId.get());
			}
			
		}
		else if(choice==2)
		{
		Double withdrawAmount = Double.valueOf(IO.readln("Enter Withdraw Amount "));
		IO.print(withdraw.apply(withdrawAmount));
		if(withdrawAmount>0&&withdrawAmount<=b1.getAccountBalance())
		{
			IO.print("\nTransaction Id is : "+transactionId.get());
		}
		}
		else
		{
			IO.println("Invalid choice Enter Number 1 or 2 ");
		}
		
		

	}

}

class Bank
{
	private double accountBalance;

	public Bank(double accountBalance)
	{
		super();
		this.accountBalance = accountBalance;
	}

	public double getAccountBalance()
	{
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance)
	{
		this.accountBalance = accountBalance;
	}
	
	
	
	
}
