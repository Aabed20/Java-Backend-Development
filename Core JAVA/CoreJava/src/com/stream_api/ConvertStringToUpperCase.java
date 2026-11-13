package com.stream_api;

import java.util.Arrays;
import java.util.List;

public class ConvertStringToUpperCase {

	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("aabed","rahil","zain","pathan");

		list.stream()
		  .map(str -> str.toUpperCase())
		  .forEach(IO::println);
	}

}
