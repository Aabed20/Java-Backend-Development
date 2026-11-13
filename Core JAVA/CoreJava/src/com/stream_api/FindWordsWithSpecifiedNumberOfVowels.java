package com.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindWordsWithSpecifiedNumberOfVowels {

	public static void main(String[] args)
	{
		
		String s = "I am learning streams API in Java";
		int n = 3;
		List<String> list = Arrays.stream(s.split(" "))
		  .filter(word ->
		  {
			 int len = word.toLowerCase().replaceAll("[^aeiou]", "").length();
			 if(len==n)return true;
			 else
			 return false;
		  }).collect(Collectors.toList());
		
		list.forEach(e -> System.out.println(e));
		
	}

}
