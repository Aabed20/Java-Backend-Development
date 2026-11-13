package com.stream_api;

import java.util.Arrays;
import java.util.Comparator;

public class FindLengthOf2ndHighestWord
{
	public static void main(String[] args)
	{
		String s1 = "I am learning streams API in Java";
		
		Integer val = Arrays.stream(s1.split(" "))
		 .map(s ->s.length())
		  .sorted(Comparator.reverseOrder())
		  .skip(1)
		   .findFirst()
		    .orElse(0);
		
		IO.print(val);
		

	}

}
