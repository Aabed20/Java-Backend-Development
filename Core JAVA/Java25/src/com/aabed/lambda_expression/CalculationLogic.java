package com.aabed.lambda_expression;

import java.util.function.Predicate;

public class CalculationLogic 
{
	public static void main(String[] args)
	{
		Predicate<Integer> isEven = x -> x%2==0;
		
		Predicate<Integer> isGreater = x -> x>10;
		
		Predicate<Integer> isPrime = x -> 
		{
			int count = 1;
			for(int i = 2; i<x/2; i++)
			{
				if(x%i==0)
				{
					count++;
				}
			}
			if(count>1)
			{
			 return false;
			}
			else
			{
				return true;
			}
			
		};
		
		Integer x = Integer.parseInt(IO.readln("Enter a number : "));
		
			IO.println(x+" is even : "+testPredicate(x, isEven));
			IO.println(x+" is greater than 10 : "+testPredicate(x, isGreater));
            IO.println(x+" is prime : "+testPredicate(x, isPrime));		
		
	}

	public static boolean testPredicate(int a, Predicate<Integer> b)
	{
		
		if(b.test(a))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
