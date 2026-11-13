package com.stream_api.filter;

import java.util.Arrays;
import java.util.List;

public class PrintPrimeNumbers
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(3,5,8,9,4);
           
		list.stream()
		   .filter(n->{
			   boolean isPrime = true;
			for(int i=2; i<=n/2; i++)
			{
				if(n%i==0)
				{
					isPrime = false;
					break;
				}
			}
			return isPrime;
		}) 
		   .forEach(IO::println);
		
		
	}

}
