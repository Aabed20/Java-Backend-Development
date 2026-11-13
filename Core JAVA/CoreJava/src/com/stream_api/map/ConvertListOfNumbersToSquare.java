package com.stream_api.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfNumbersToSquare
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(10,2,4,5,3,8);
       
		List<Integer> list2 = list.stream()
		  .map(n-> n*n)
		  .collect(Collectors.toList());
		
		IO.println(list2);
		
	}

}
