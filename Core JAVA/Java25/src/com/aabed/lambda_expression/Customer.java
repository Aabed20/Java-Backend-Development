package com.aabed.lambda_expression;

import java.util.function.Predicate;

public record Customer(String name,Double salary,Integer creditScore,Integer age) 
{

	
	public boolean checkLoanEligibility()
	{
		Predicate<Customer> p1 = cust -> cust.salary()>25000&&cust.creditScore()>700&&cust.age()>21;
		if(p1.test(this))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
