package com.aabed.stream_api;

import java.util.Arrays;

public class ElementsContainingAInName 
{
	public static void main(String[] args) 
	{
		 String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
		 
		Object[] startNames= Arrays.stream(names)
		  .filter(name -> name.contains("a")||name.contains("A"))
		  .toArray();

		IO.println("Names Containing A or a : "+Arrays.toString(startNames));
	}

}
