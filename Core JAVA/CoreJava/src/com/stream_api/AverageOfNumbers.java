package com.stream_api;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(30,20,15,10,20,25);
    
		  double avg = list.stream()
		   .mapToInt(n->Integer.valueOf(n))
		    .average()
		     .getAsDouble();
		 
		 IO.print(avg);
		
	}

}
