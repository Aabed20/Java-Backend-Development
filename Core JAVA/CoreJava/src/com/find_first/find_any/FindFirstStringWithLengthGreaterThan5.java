package com.find_first.find_any;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstStringWithLengthGreaterThan5
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("aabed","khan","hello","pathan");
		
		Optional<String> first = list.stream()
		     .filter(n-> n.length()>5)
		     .findFirst();
		
		IO.print(first.get());

	}

}
