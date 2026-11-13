package com.stream_api.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ConcatenateAllStrings
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("java","is","platform","independent");
		
		Optional<String> reduce = list.stream()
		  .reduce((s1,s2)-> s1+" "+s2);

		IO.print(reduce.get());
	}

}
