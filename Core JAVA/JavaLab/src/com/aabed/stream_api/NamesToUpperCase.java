package com.aabed.stream_api;

import java.util.Arrays;

public class NamesToUpperCase
{
	public static void main(String[] args)
	{
		String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};
		
		Object[] arr=Arrays.stream(names)
		 .map(name -> name.toUpperCase())
		  .toArray();
		IO.println(Arrays.toString(arr));
	}

}
