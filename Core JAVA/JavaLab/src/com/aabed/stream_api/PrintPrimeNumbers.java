package com.aabed.stream_api;

import java.util.Arrays;

public class PrintPrimeNumbers
{
	public static void main(String[] args)
	{
		Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		
	Object[] primenumbers =	Arrays.stream(numbers)
		  .filter(num -> isPrime(num))
		   .toArray();
		
		IO.println("Prime Numbers are : "+Arrays.toString(primenumbers));

	}
	static boolean isPrime(int num)
	{
		boolean prime =false;
		int count = 0;
		if(num>0) {
		for(int i=1; i<=num/2; i++)
		{
		 if(num%i==0)
		 {
			 count++;
		 }
		}
		}
		if(count==1)
		{
			prime = true;
		}
		return prime;
	}

}
