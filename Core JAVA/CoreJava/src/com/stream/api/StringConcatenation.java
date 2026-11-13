package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class StringConcatenation
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("java","is","platform","independent","programming","language");
		
		String s = list.stream()
		   .reduce((a,b)->a+" "+b).get();

		IO.print(s);
	}

}
