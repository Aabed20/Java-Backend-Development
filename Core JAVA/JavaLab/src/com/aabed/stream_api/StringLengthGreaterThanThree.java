package com.aabed.stream_api;

import java.util.Arrays;

public class StringLengthGreaterThanThree 
{
	public static void main(String[] args)
	{
		String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};

		Object[] names=Arrays.stream(words)
		  .filter(name -> name.length()>3)
		   .toArray();
       IO.println(Arrays.toString(names));
	}
}
