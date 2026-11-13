package com.aabed.RTPs;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo 
{
	public static void main(String[] args) 
	{
		//1.Salary Hike
	/*	UnaryOperator<Double> salaryHike = s -> s+s*0.2;
		
		Double d = Double.parseDouble(IO.readln("Enter Your Salary : "));
		IO.println("The Updated Salary is : "+salaryHike.apply(d));
     */
		
		//2.Upper Case
		UnaryOperator<String> uppercase = s -> s.toUpperCase();
		
		String str = IO.readln("Enter String value : ");
		IO.println("The String is Converted to Upper Case : "+uppercase.apply(str));
	
		
		
	}

}
