package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddNumbers
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,6,7,8};
		
		Map<Boolean, List<Integer>> map = Arrays.stream(arr)
		.boxed()
		.collect(Collectors.partitioningBy((n)->n%2==0));
		
		IO.print(map);
		
        		
	}

}
