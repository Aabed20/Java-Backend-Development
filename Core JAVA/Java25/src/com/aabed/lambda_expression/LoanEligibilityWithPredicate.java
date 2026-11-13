package com.aabed.lambda_expression;

public class LoanEligibilityWithPredicate
{
	public static void main(String[] args) 
	{
		String name = IO.readln("Enter Customer Name: ");
		Double salary = Double.parseDouble(IO.readln("Enter Salary: "));
		Integer creditScore = Integer.parseInt(IO.readln("Enter Credit Score: "));
		Integer age = Integer.parseInt(IO.readln("Enter Age : "));
		
		Customer customer = new Customer(name,salary,creditScore,age);
		
		if(customer.checkLoanEligibility())
		{
			IO.println(customer.name()+" is Eligible for Loan...");
		}
		else
		{
			IO.println(customer.name()+" is NOT Eligible for Loan...");
		}

	}

}
