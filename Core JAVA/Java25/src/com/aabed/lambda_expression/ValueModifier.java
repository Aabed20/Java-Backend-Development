package com.aabed.lambda_expression;

import java.util.function.*;

public class ValueModifier
{
	public static void main(String[] args) 
	{
		int number = Integer.parseInt(IO.readln("Enter a number : "));
		
		Consumer<Integer> doubleValue = a -> IO.println("After doubling the value: "+(a+a));
		
		Consumer<Integer> incrementBy = a -> IO.println("After incrementing the value by 3: "+(a+3));
		
		Consumer<Integer> squareValue = a -> IO.println("After squaring the value: "+(a*a));
        
		IO.println("Original value: "+number);
		modifyValue(number, doubleValue);
		modifyValue(number, incrementBy);
		if(number>0)
		{
		modifyValue(number, squareValue);
		}
		
		
	}
	public static void modifyValue(int value, Consumer<Integer> a)
	{
		a.accept(value);
	}

}
