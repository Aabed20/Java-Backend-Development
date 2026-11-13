package com.aabed.stream_api;

import java.util.ArrayList;
import java.util.List;

public class StringFirstCharToUpper
{
	public static void main(String[] args)
	{
		ArrayList<String> strings = new ArrayList<>();
		
		strings.add("aabed");
		strings.add("asif");
		strings.add("mateen");
		strings.add("tej");
		
		List<String> list = strings.stream() 
		   .map((str) -> str.substring(0, 1).toUpperCase()+str.substring(1))
		     .toList();

		IO.println(list);
	}

}
