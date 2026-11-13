package com.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DivideListIntoEvenAndOddLists
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(10,2,30,5,3,9,8,4);
		
        Map<Boolean, List<Integer>> map = list.stream()
         .collect(Collectors.partitioningBy(n-> n%2==0));
		
        List<Integer> even = map.get(true);
        List<Integer> odd = map.get(false);
        
        System.out.println(even);
        System.out.println(odd);
	}

}
