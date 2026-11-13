package com.min_max;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindSmallestElementInList
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(10,20,5,9,8,4,7,12);
		
		Optional<Integer> min = list.stream()
		    .min((a,b)-> Integer.compare(a, b));
		
		IO.print(min.get());
	}
}
