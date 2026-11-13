package com.stream_api.limit_skip;

import java.util.Arrays;
import java.util.List;

public class Skipfirst3Elements
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(10,20,3,5,8,19,28);
		
		list.stream()
		 .skip(3)
		 .forEach(IO::println);
		
	}

}
