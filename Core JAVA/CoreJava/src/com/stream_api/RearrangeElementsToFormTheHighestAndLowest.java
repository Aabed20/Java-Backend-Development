package com.stream_api;

import java.util.Arrays;
import java.util.Comparator;

public class RearrangeElementsToFormTheHighestAndLowest
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,5,4};
		
		int[] lowest = Arrays.stream(arr)
		   .sorted()
		    .toArray();
      
		 int[] highest = Arrays.stream(arr)
		    .boxed()
		   .sorted(Comparator.reverseOrder())
		   .mapToInt(n->Integer.valueOf(n))
		    .toArray();
		  
		 IO.println("lowest : "+Arrays.toString(lowest));
		 IO.println("highest : "+Arrays.toString(highest));
		 
         
	}

}
