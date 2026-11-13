package com.aabed.stream_api;

import java.util.ArrayList;
import java.util.List;

public class StringInLowerAndConvertToList
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		
		list.add("AABed");
		list.add("ASIF");
		list.add("MaTeeN");
		list.add("PaTHan");
		
		List<String> list2 = list.stream()
		 .map((s1) -> s1.toLowerCase())
		  .toList();
		
		IO.println(list2);

	}

}
