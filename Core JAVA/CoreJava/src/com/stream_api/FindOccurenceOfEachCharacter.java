package com.stream_api;

import java.util.Map;
import java.util.stream.Collectors;

public class FindOccurenceOfEachCharacter
{
	public static void main(String[] args)
	{
	   String s = "Mississippi";
	    
	   Map<Character, Long> map = s.chars()
         .mapToObj(n->(char)n)
           .collect(Collectors.groupingBy(n->n,Collectors.counting()));
	   
	   IO.print(map);
    }

}
