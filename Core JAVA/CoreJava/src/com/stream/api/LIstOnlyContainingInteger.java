package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class LIstOnlyContainingInteger
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("abc","123","456","xyz");
		
		List<Integer> list2 = list.stream()
		.filter(s->
		{
			try
			{
				 Integer.valueOf(s);
				 return true;
			}
			catch(Exception e)
			{
				return false;
			}
		}
				)
		.map(n->Integer.valueOf(n))
		.toList();
	   IO.print(list2);

	}

}
