package com.stream_api;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordWith2ndHighestLength
{
	public static void main(String[] args)
	{
		String s = "I am leaning streams API in Java";
		
		String[] split = s.split(" ");
		
		String str = Arrays.stream(split)
		  .sorted((s1,s2) ->Integer.compare(s2.length(), s1.length()))
		  .skip(1)
		    .limit(1)
		      .collect(Collectors.joining());
		
		IO.print(str);
	}

}
