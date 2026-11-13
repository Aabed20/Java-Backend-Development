package com.stream_api;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOccurenceOfEachWord
{
	public static void main(String[] args)
	{
		String s = "I am learning stream API in Java Java";
		
		Map<String, Long> data = Arrays.stream(s.split(" "))
		 .collect(Collectors.groupingBy(word -> word,Collectors.counting()));
	   
		   IO.print(data);
	}

}
