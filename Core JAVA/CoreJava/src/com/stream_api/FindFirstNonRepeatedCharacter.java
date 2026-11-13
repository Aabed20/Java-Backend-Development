package com.stream_api;

import java.util.Optional;

public class FindFirstNonRepeatedCharacter
{
	public static void main(String[] args)
	{
		String s = "Hello World";
		
		  Optional<Character> first = s.chars()
		  .mapToObj(n-> (char) n)
		  .filter(ch-> s.indexOf(ch)==s.lastIndexOf(ch))
		   .findFirst();
		  
		  IO.print(first.get());
		 
	}

}
