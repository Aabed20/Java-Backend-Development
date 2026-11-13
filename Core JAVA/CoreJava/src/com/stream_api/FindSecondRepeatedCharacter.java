package com.stream_api;

import java.util.Optional;

public class FindSecondRepeatedCharacter
{
	public static void main(String[] args)
	{
		String s = "Java programming";
		
		Optional<Character> second = s.chars()
		  .mapToObj(ch -> (char)ch)
		   .filter(ch-> s.indexOf(ch)!=s.lastIndexOf(ch))
		   .distinct()
		    .skip(1)
		    .findFirst();
		
		IO.print(second.get());

	}

}
