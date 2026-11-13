package com.aabed.loose_coupling;

import java.util.function.Predicate;

public class Passwordchecker 
{
	public static void main(String[] args) 
	{
		Predicate<String> isValidPassword = (s) ->
		{
			char ch[] =s.toCharArray();
			boolean containsDigit = false;
			boolean isUpper = false;
			for(int i=0;i<ch.length;i++)
			{
				if(Character.isDigit(ch[i]))
				{
				containsDigit = true;
				
				}
				if(Character.isUpperCase(ch[i]))
				{
					isUpper = true;
					
				}
				
			}
			if(ch.length>=8&&containsDigit==true&&isUpper==true)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		};
		
		String s1 = IO.readln("Enter your password : ");
		if(isValidPassword.test(s1))
		{
			IO.println("Your Password "+s1+" is Valid");
		}
		else
		{
	
			System.err.println("Your password "+s1+" is Invalid\nEnter alteast 8 character password containing atleast 1 digit containing atleast 1 uppercase Letter");
		}

	}

}
