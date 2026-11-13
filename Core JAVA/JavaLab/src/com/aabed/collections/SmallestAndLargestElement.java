package com.aabed.collections;

import java.util.Arrays;

public class SmallestAndLargestElement
{
	public static void main(String[] args)
	{
		int []arr = {15, 3, 7, 22, 5, 9, 12};
		int greatest = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]>greatest)
				{
					 greatest= arr[j];	
				}
			}
		}

		IO.println("Largest number is : "+greatest);
		int smallest=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]<smallest)
				{
					 smallest= arr[j];	
				}
			}
		}
		
		IO.println("Smallest number is : "+smallest);
		//2 Lines Required Only
		Arrays.sort(arr);
		IO.println("smallest Element is : "+arr[0]+" Largest Element is : "+arr[arr.length-1]);
		
	}

}
