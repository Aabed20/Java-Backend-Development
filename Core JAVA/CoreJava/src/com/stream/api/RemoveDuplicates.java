package com.stream.api;

import java.util.stream.Collectors;

public class RemoveDuplicates
{
	public static void main(String[] args)
	{
		
		String s = "dabcadefg";
		
		String str = s.chars()
		 .mapToObj((ch)->(char)ch)
		 .distinct()
		 .map(ch->ch+"")
		 .collect(Collectors.joining());

		IO.print(str);
	}

}
