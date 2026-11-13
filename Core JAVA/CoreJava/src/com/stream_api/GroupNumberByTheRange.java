package com.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class GroupNumberByTheRange{

	public static void main(String[] args)
	{
		int []arr= {2,3,10,14,20,24,30,34,40,44,50,54};
				
		Map<Integer, List<Integer>> map = 
				Arrays.stream(arr)
		   .boxed()
		    .collect(Collectors.groupingBy(n ->(n/10)*10,TreeMap::new,Collectors.toList()));
		
		IO.print(map);
	}


}
