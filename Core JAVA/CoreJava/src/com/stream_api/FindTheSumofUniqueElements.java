package com.stream_api;

import java.util.Arrays;

public class FindTheSumofUniqueElements
{
	public static void main(String[] args)
	{
		int arr[] = {10,2,3,9,8,5,20,2,9,8,4,6};
		
		Integer sum = Arrays.stream(arr)
		  .boxed()
		   .distinct()
		    .reduce(0,(a,b)-> a+b);
		
		IO.print(sum);

	}

}
