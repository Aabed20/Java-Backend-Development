package com.stream_api.map;

import java.util.Arrays;
import java.util.List;

public class ConvertStringToUpperCase {

	public static void main(String[] args) 
	{
  List<String> list = Arrays.asList("Hello","jpa","Oracle","jdbc","Java Programming");
		
		list.stream()
		   .map(n-> n.toUpperCase())
		   .forEach(IO::println);

	}

}
