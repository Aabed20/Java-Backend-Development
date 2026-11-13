package com.stream_api;

import java.util.Arrays;
import java.util.List;

public class CountNamesStartWithA {

	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("Aabed","rahil","pathan","Ankita");
         long count = list.stream()
            .filter(str -> str.charAt(0)=='A')
               .count();
           IO.println(count);
	}

}
