package com.stream_api.filter;

import java.util.Arrays;
import java.util.List;

public class StringContainingJava
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Hellojava","jpa","oracle","jdbc","java programming");
		
		list.stream()
		   .filter(n-> n.contains("java"))
		   .forEach(IO::println);
 	}

}
