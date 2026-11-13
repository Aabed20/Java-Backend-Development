package com.anymatch_allmatch.nonematch;

import java.util.Arrays;
import java.util.List;

public class CheckIfAnyNumberIsDivisibleBy5
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(12,23,45,20,10);

		boolean val = list.stream()
		 .anyMatch(n-> n%5==0);
		
		IO.print("Any number is divisible by 5 : "+val);
	}

}
