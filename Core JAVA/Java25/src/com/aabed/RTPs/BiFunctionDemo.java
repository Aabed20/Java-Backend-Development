package com.aabed.RTPs;

import java.util.function.BiFunction;

public class BiFunctionDemo 
{
	public static void main(String[] args) 
	{
	  //1.Student grade calculator
		/*Integer marks = Integer.valueOf(IO.readln("Enter you Marks : "));
		Integer totalMarks = Integer.valueOf(IO.readln("Enter Total marks : "));
		
		BiFunction<Integer,Integer,Double> calculateMarks = (a,b) -> (a*100.0/b);
		
		
		IO.println("Your percentage is : "+calculateMarks.apply(marks,totalMarks));
		*/
		
		//2.Full Name generator
	/*	String fname = IO.readln("Enter your first name : ");
		String lname = IO.readln("Enter your last name : ");
		BiFunction<String,String,String> namegenerator = (a,b) -> a+" "+b;
		
		IO.println("Your Full Name is : "+namegenerator.apply(fname, lname));
	 */
		
		//3.Product Price After Discount
		
	 Integer price = Integer.valueOf(IO.readln("Enter price : "));
		Double percentage = Double.valueOf(IO.readln("Enter discount Percentage : "));
		
		BiFunction<Integer,Double,Double> discountedPrice = (orgprice,percen) -> orgprice-orgprice*percen/100;
		
		IO.println("The Final price will be : "+discountedPrice.apply(price, percentage));
	
	}

}
