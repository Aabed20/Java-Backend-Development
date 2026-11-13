package com.stream_api;

import java.util.Arrays;
import java.util.List;

public class CreateListContainingOnlyIntegers
{
	public static void main(String[] args)
	{
		String []arr = {"234","abc","789","lion"};
		
		List<Integer> list = Arrays.stream(arr)
		  .filter(s-> 
		  {
			  try
			  {
				  Integer.parseInt(s);
				  return true;
			  }
			  catch(Exception e)
			  {
				  return false;
			  }
		  })
		  .map(n -> Integer.valueOf(n))
		   .toList();			 
		  
		IO.print(list);
		

	}

}
