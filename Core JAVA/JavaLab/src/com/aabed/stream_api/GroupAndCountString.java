package com.aabed.stream_api;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAndCountString 
{
	public static void main(String[] args)
	{
		
		List<String> strings = List.of("apple", "banana", "orange", "grape", "pear");

		Map<Integer, Long> collect = strings.stream()
				
		  .collect(Collectors.groupingBy(str-> str.length(),Collectors.counting()))
		  ;
		
		collect.forEach((k,v)->IO.println(k+" -> "+v));
		   
	}

}
