package com.anymatch_allmatch.nonematch;

import java.util.Arrays;
import java.util.List;

public class CheckAllNumbersArePositive
{
	public static void main(String[] args)
	{
		
		List<Integer> list = Arrays.asList(2,4,5,-2,9);
 
		boolean allMatch = list.stream()
		  .allMatch(n-> n>0);
		
		IO.println(allMatch);
	}

}
