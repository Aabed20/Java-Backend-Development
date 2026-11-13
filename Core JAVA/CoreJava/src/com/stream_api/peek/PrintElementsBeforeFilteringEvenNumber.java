package com.stream_api.peek;

import java.util.Arrays;
import java.util.List;

public class PrintElementsBeforeFilteringEvenNumber {

	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(10,20,3,4,5,15,42);
		
		list.stream()
		  .peek(n-> System.out.println("Before Filtering : "+n))
		   .filter(n->n%2==0)
		    .forEach(n->System.out.println("After filtering : "+n));

	}

}
