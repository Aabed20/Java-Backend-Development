package com.stream.api;

public class Main
{
	public static void main(String[] args)
	{
		Opertaion<Integer,Integer> op = (a,b) -> a+b; 
		
		System.out.println(op.add(10, 20));
		

	}

}
