package com.aabed.stream_api;

import java.util.Arrays;

public class SortingArrayInReverse
{
	public static void main(String[] args)
	{
		int arr[] = {3,5,2,1,7,9,8};
		
		Object array[]=Arrays.stream(arr)
		.boxed()
		  .sorted((i1,i2)->i2.compareTo(i1))
		    .toArray();
		  
		  IO.println(Arrays.toString(array));
	}
}
