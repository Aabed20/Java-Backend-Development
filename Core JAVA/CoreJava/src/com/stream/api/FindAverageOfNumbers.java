package com.stream.api;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class FindAverageOfNumbers
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,3,35,5,7,35,35};
		
		Integer totalSum = Arrays.stream(arr)
		 .boxed()
		  .collect(Collectors.summingInt(n->n));

		//IO.println(totalSum);
		
		IntSummaryStatistics all = Arrays.stream(arr) 
		  .boxed()
		   .collect(Collectors.summarizingInt(n ->n));
		
		IO.println("Averge : "+all.getAverage());
		IO.println("count : "+all.getCount());
		IO.println("Max : "+all.getMax());
		IO.println("Min : "+all.getMin());
		IO.println("Sum : "+all.getSum());
	}

}
