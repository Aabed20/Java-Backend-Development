package com.aabed.RTPs;

import java.time.LocalDate;
//import java.util.Random;
import java.util.function.Supplier;

public class SuplierDemo
{
	public static void main(String[] args) 
	{
		//1.OTP Generator
	/*	Supplier<String> otpGenerator = ()->
		{
			String result = "";
			Random r = new Random();
			for(int i=0; i<6; i++)
			{
				result = result+ r.nextInt(10)+"";
			}
			
			return result;
		};
		
		IO.println("Random Otp Generated is : "+otpGenerator.get());
     */
		
		//2.Current Date Supplier
		
		Supplier<LocalDate> currentDate = () -> 
		{
			LocalDate d = LocalDate.now();  
			return d;
		};
		
		IO.println("The Current Date is : "+currentDate.get());
		
	}

}
