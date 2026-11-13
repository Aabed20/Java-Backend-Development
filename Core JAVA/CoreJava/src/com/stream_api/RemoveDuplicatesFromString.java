package com.stream_api;

import java.util.stream.Collectors;

public class RemoveDuplicatesFromString
{
	public static void main(String[] args)
	{
		
		String s = "dabcaefg";
		
		   String s1 = s.chars()
		   .mapToObj(n -> String.valueOf((char)n))
		    .distinct() 
		    .collect(Collectors.joining());
		    
		    System.out.println(s1);
		
	}

}
