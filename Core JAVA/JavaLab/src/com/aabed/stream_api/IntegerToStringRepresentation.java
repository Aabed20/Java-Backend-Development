package com.aabed.stream_api;

import java.util.Arrays;

public class IntegerToStringRepresentation 
{
	public static void main(String[] args)
	{
		Integer[] numbers = {10, 20, 30, 40, 50};
		IO.print("Converted Strings : ");
		Object[] names=Arrays.stream(numbers)
		 .map(num -> ("Number: "+num.toString()))
		  .toArray();
		IO.println(Arrays.toString(names));
	}
}
