package com.aabed.lambda_expression;

import java.util.function.BiPredicate;

public class Bipredicate 
{
	public static void main(String[] args) 
	{
		String name = IO.readln("Enter your User Name : ");
		String password = IO.readln("Enter your password : ");

		BiPredicate<String, String> validation = (a,b) ->
		{
			
			return !a.isBlank()&&b.length()>=8&&!b.contains(" ");
//			char ch[] = b.toCharArray();
//			boolean isSpace = false;
//			int length = b.length();
//			for(int i=0; i<ch.length; i++)
//			{
//				if(ch[i]==' ')
//				{
//					isSpace = true;
//				}
//			}
//			if(a.isBlank())
//			{
//				return false;
//			}
//			
//			if(isSpace==false&&length>=8)
//			{
//				return true;
//			}
//			
//			return false;
		};
		
		
	if(validation.test(name, password))
	{
		IO.println("Login Successfull");
	}
	else
	{
		IO.println("Wrong Inputs :\n1.Username Can't be empty\n2.Password should be 8 characters and does not contain space");
	}
		
	}

}
