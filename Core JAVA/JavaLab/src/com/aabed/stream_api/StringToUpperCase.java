package com.aabed.stream_api;

import java.util.ArrayList;

public class StringToUpperCase
{
	public static void main(String[] args)
	{
		ArrayList<String> strings = new ArrayList<>();
		
		strings.add("Aabed");
		strings.add("Pathan");
		strings.add("Asif");
		strings.add("tej");
		strings.add("mateen");
		
		strings.stream()
		   .map((s)-> s.toUpperCase())
		     .forEach(IO::println);

	}

}
