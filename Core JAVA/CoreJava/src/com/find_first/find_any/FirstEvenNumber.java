package com.find_first.find_any;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstEvenNumber
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(3,5,8,9,10,15);
		
		Optional<Integer> first = list.stream()
		  .filter(n -> n%2==0)
		   .findFirst();
		
		IO.println(first.get());
	}

}
