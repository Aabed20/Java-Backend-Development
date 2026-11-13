package com.aabed.stream_api;

import java.util.List;

public class StringSortInDescending 
{
	public static void main(String[] args)
	{
		List<String> strings = List.of("apple", "banana", "orange", "grape", "pear");	
		strings.stream()
		  .sorted((str1,str2) -> str2.compareTo(str1))
		   .forEach(IO::println);
	}

}
