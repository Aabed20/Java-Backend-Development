package com.aabed.lambda_expression;

import java.util.Random;
import java.util.function.Supplier;

public class PasswordGenerator 
{
	public static void main(String[] args) 
	{
		 String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String lower = "abcdefghijklmnopqrstuvwxyz";
		 String digits = "0123456789";
		 String special = "@#$%!&*";
		 
		 String all = upper+lower+digits+special;
		
         Supplier<String> passwordSupplier =()->
         {
        	Random random = new Random();
        	StringBuilder sb = new StringBuilder();
        	
        	for(int i=0; i<8; i++)
        	{
        	 int position =	random.nextInt(all.length());
        	 sb.append(all.charAt(position));
        	}
        	
        	return sb.toString();
         };
		 
         IO.println("Random Password Generated is : "+passwordSupplier.get());
	}

}
