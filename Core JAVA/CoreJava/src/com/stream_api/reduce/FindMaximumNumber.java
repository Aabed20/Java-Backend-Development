package com.stream_api.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaximumNumber
{
	public static void main(String[] args) 
	{
	
		List<Integer> list = Arrays.asList(10,20,24,34,50,15,12);
      
		Optional<Integer> reduce = list.stream()
		   .reduce((a,b) -> a > b ? a : b);
		
		IO.print(reduce.get());
	}

}
