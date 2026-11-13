package com.stream.api;

import java.util.Arrays;
import java.util.Optional;

public class FindWordWithHighestLength
{
	public static void main(String[] args)
	{
		String s = "I am learning streams API in Java";
		
		Optional<String> max = Arrays.stream(s.split(" "))
		 .max((a,b)->Integer.compare(a.length(), b.length()));
		
		max.ifPresent(IO::print);

	}

}
