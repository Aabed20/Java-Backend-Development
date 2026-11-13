package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumbers
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(2,3,5,8,9,4,6);

		List<Integer> even = list.stream()
		   .filter(n->n%2==0)
		    .collect(Collectors.toList());
		 
		IO.print(even);
	}

}
