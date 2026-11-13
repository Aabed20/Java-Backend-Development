package com.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaximumAndMinimumElement {

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(10,2,5,8,9,12,3,4,20);
		   
		Optional<Integer> max = list.stream()
		  .max((s1,s2)->Integer.compare(s1, s2));
		
		IO.println(max.get());
		
		Optional<Integer> min = list.stream()
		  .min((e1,e2)-> Integer.compare(e1,e2));
		
		IO.print(min.get());
	}

}
