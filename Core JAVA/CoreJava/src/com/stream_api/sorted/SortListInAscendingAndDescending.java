package com.stream_api.sorted;

import java.util.Arrays;
import java.util.List;

public class SortListInAscendingAndDescending
{
	public static void main(String[] args)
	{
       List<Integer> list = Arrays.asList(10,2,5,1,9,4,3,20);		

       List<Integer> Ascending = list.stream() 
         .sorted()
         .toList(); 
       
       IO.println(Ascending);
       
       List<Integer> descending = list.stream()
         .sorted((i1,i2)->Integer.compare(i2, i1))
          .toList();
       IO.println(descending);
       
	}

}
