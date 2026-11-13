package com.aabed.stream_api;

import java.util.Arrays;

public class BooleanValueToYesOrNo
{
	public static void main(String[] args)
	{
		Boolean[] flags = {true, false, true, false, true};
		
		Object[] arr= Arrays.stream(flags)
		 .map(val -> 
		 {
			 if(val==true)
		 {
			 return "Yes";
			 }
			 else
			 {
				 return "No";
			 }
		 }
		 ).toArray();
       
		IO.println("Yes/No Values : "+Arrays.toString(arr));
	}

}
