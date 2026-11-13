package com.stream_api.reduce;

import java.util.Arrays;
import java.util.List;

public class FindSumOfAllIntegers
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(20,10,2,35,6,4,8,5);
		
		 Integer reduce = list.stream()
		 .reduce(0,(e1,e2) -> e1+e2);
		
	     IO.print(reduce);
	}

}
