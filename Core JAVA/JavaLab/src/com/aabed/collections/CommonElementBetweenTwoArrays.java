package com.aabed.collections;

public class CommonElementBetweenTwoArrays
{
	public static void main(String[] args)
	{
		int[] arr1 = {1, 3, 4, 7, 9, 10};
	    int[] arr2 = {2, 3, 7, 6, 9, 12};

	    IO.print("Common elements are : ");
        for(int i=0; i<arr1.length; i++)
        {
        	if(arr1[i]==0)continue;
        	for(int j=0; j<arr2.length; j++)
        	{
        		if(arr1[i]==arr2[j])
        		{
        			IO.print(arr1[i]+" ");
        			
        		}
        	}
        }
	    
	    
	}

}
