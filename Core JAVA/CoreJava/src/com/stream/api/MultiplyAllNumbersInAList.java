package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class MultiplyAllNumbersInAList
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(10,4,5,6,3,2,9);
		
		Integer res = list.stream() 
		   .reduce(1,(a,b)->a*b);

		IO.print(res);
	}

}
