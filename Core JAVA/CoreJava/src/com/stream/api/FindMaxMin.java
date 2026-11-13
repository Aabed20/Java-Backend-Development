package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxMin
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(2,3,5,8,9,4,6);

		Optional<Integer> min = list.stream()
            .sorted()
             .findFirst();
		
		IO.println(min.get());
		
		Optional<Integer> max = list.stream()
	            .sorted((a,b)->Integer.compare(b, a))
	             .findFirst();
			
			IO.println(max.get());

	}

}
