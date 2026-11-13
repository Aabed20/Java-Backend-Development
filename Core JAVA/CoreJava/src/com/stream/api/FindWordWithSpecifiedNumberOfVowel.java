package com.stream.api;

import java.util.Arrays;

public class FindWordWithSpecifiedNumberOfVowel
{
	public static void main(String[] args)
	{
        String s = "I am learning streams API in Java";
        
        int vowel = 2;
        
     //   Optional<String> first = 
        		Arrays.stream(s.split(" "))
        .filter(str->
        {   int len=str.toLowerCase().replaceAll("[^aeiou]", "").length();
        		return len==vowel;})
        .forEach(IO::println);
        
      //  first.ifPresentOrElse(IO::print, ()->IO.print("Not Available"));

	}

}
