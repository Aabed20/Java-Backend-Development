package com.aabed.stream_api;

import java.util.Arrays;

public class ExtractingFirstLetterOfName
{
	public static void main(String[] args)
	{
		 String []names = {"James", "Aryan", "Vibha", "Aniket"};
		 
	  Object[] arr = Arrays.stream(names)
		   .map(name -> name.charAt(0))
		    .toArray();

	  IO.println("First Letters : "+Arrays.toString(arr));
	}

}
