package com.stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class SortList {

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(10,2,5,8,9,12,3,4,20);
		   
		list.stream()
		  .sorted()
		   .forEach(IO::println);
		
		list.stream()
		 .sorted(Comparator.reverseOrder())
		   .forEach(IO::println);

	}

}
