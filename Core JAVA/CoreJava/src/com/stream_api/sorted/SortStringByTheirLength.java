package com.stream_api.sorted;

import java.util.Arrays;
import java.util.List;

public class SortStringByTheirLength
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Aabed","pathan","Java","programming","you","i");

		list.stream()
		   .sorted((s1,s2)-> Integer.compare(s2.length(), s1.length()))
		   .forEach(IO::println);
		
		list.stream()
		.sorted((s1,s2) ->s1.compareToIgnoreCase(s2))
		.forEach(IO::println);
	}

}
