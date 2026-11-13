package com.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenListOfLists {

	public static void main(String[] args) 
	{
		List<List<Integer>> list = new ArrayList<>();
		
		list.add(Arrays.asList(2,3,4));
		list.add(Arrays.asList(4,5,6));
		list.add(Arrays.asList(2,9,5));
		
		list.stream()
		  .flatMap(l -> l.stream())
		   .forEach(IO::println);

	}

}
