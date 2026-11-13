package com.stream_api;

import java.util.Optional;

public class FirstFirstRepeatedCharacter
{
	public static void main(String[] args)
	{
		String s = "Hello World";
		
		Optional<Character> first = s.chars()
		 .mapToObj(ch -> (char)ch)
		 .filter(ch -> s.indexOf(ch)!=s.lastIndexOf(ch))
		  .findFirst();
		
		IO.print(first.get());
	}

}
