package com.aabed.stream_api;

import java.util.stream.Stream;

public class FirstTenOddnumberSquare
{
	public static void main(String[] args)
	{
		IO.println("First 10 Odd squares : ");
		Stream.iterate(1, num -> num+1)
		.filter(num -> num*num%2==1)
		  .map(num -> num*num)
		  .limit(10)
		  .forEach(IO::println);
	}

}
