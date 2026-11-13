package com.stream_api.flatmap;

import java.util.Arrays;
import java.util.List;

public class PrintUniqueWordsFromSentence {

	public static void main(String[] args)
	{
		
		List<String> list = Arrays.asList("hello java","i ate biryani","i am coding","i love coding","i am java developer");
		
		
		 List<String> list2 = list.stream()
		   .flatMap( sentence-> Arrays.stream(sentence.split(" ")))
		     .distinct()
		       .toList();
		     
		     IO.print(list2);
	}

}
