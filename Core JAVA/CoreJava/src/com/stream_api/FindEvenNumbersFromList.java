package com.stream_api;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumbersFromList {

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,3,2,4,5,7,6,8);
		
		list.stream()
		  .filter( n -> n%2==0)
		  .forEach(IO::println);
		
	}

}
