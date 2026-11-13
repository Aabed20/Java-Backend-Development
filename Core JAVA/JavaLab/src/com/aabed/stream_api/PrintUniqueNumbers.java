package com.aabed.stream_api;

import java.util.Arrays;

public class PrintUniqueNumbers 
{
	public static void main(String[] args) 
	{
		 Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};
		 
		Object[] num= Arrays.stream(numbers)
		  .distinct().toArray();
       IO.println("Unique Numbers are : "+Arrays.toString(num));
	}
}
