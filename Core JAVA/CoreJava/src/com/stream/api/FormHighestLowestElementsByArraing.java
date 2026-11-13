package com.stream.api;

import java.util.Arrays;

public class FormHighestLowestElementsByArraing
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,5,4};
		
		Arrays.stream(arr)
		.boxed()
		.sorted()
		.forEach(IO::print);
		
		IO.println();
		Arrays.stream(arr)
		.boxed()
		 .sorted((a,b)->Integer.compare(b, a))
		 .forEach(IO::print);

	}

}
