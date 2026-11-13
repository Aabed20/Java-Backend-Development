package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfStringToUpperCase
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("aabed","rahil");
		
		List<String> str = list.stream()
          .map(s -> s.toUpperCase())
           .collect(Collectors.toList());
		
		IO.print(str);
	}

}
