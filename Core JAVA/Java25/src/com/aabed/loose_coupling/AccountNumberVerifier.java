package com.aabed.loose_coupling;

import java.util.function.Function;
import java.util.function.Predicate;

public class AccountNumberVerifier 
{
	public static void main(String[] args) 
	{
		
	Predicate<String> lengthIs10 = str -> str.length()==10;
	
	Predicate<String> allDigits = str -> 
	{
		char ch[]=str.toCharArray();
		int count = 0;
		for(int i=0; i<ch.length; i++)
		{
			if(Character.isDigit(ch[i]))
			{
				count++;
			}
		}
		
		if(count==10)
		{
			return true;
		}
		else
		{
			return false;
		}

	};
	
	Predicate<String> notStartsWithZero = str -> str.length()>0&&str.charAt(0)!='0';
	

	Predicate<String> isValid = (str) ->
	{
		if(lengthIs10.test(str)&&allDigits.test(str)&&notStartsWithZero.test(str))
		{
			return true;
		}
		else
		{
			return false;
		}
	};

    Function<String, String> maskedAccount = str ->
    {
    	if(str.length()==10)
    	{
    	return "******"+str.substring(6);
    	}
    	return"";
    };
    
    String s = IO.readln("Enter Account Number : ");
    if(isValid.test(s))
    {
    	IO.println("Your Account Number Validated successfully : "+maskedAccount.apply(s));
    }
    else
    {
      System.err.println("Account Number "+s+" is Not Valid ");
    }
    
	}

}
