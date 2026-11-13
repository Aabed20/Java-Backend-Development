package com.stream_api.map;

import java.util.Arrays;
import java.util.List;

public class ConvertsNumbersToString
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(10,2,4,5,3,8);
		
		List<String> list2 = list.stream()
		 .map(n-> n.toString())
		  .toList();
 
	}

}
