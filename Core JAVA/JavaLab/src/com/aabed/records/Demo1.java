package com.aabed.records;

public record Demo1(String ...names) 
{
	public void getNames()
	{
		System.out.print("Names are :");
		for(String name : names)
		{
			System.out.print(name+" ");
		}
		
	}

}
