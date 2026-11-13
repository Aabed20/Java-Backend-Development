package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class CountNamesStartsWithA
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("rahil","aabed","asef","tejas");
		
		long counts = list.stream()
		  .filter(s -> s.toLowerCase().startsWith("a"))
		   .count();
		
		IO.print(counts);

	}

}
