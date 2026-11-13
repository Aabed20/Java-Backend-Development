package com.stream.api;

import java.util.Optional;

public class FindFirstNonRepeatedCharacter
{
	public static void main(String[] args)
	{
		String s = "Hello world";
		
		Optional<Character> firstNonRepeated = s.chars()
		.mapToObj((ch)->(char)ch)
		 .filter(ch->s.indexOf(ch)==s.lastIndexOf(ch))
		 .findFirst();
		
		firstNonRepeated.ifPresent(IO::print);IO.println();
		
		
				s.chars()
		.mapToObj(ch->(char)ch)
		.filter(ch->s.indexOf(ch)!=s.lastIndexOf(ch))
		.distinct()
		.skip(1)
		.limit(1)
		.forEach(IO::print);
		
        
	}

}
