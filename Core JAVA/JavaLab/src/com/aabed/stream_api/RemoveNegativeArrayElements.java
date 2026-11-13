package com.aabed.stream_api;

import java.util.Arrays;

public class RemoveNegativeArrayElements 
{
	public static void main(String[] args) 
	{
		Integer[] numbers = {-10, -5, 0, 5, 10, 15, -20};
		
		Object[] arr=Arrays.stream(numbers)
		  .filter(num -> num>0)
		  .toArray();
       IO.println("Positive Numbers : "+Arrays.toString(arr));
	}

}
