package com.aabed.stream_api;

import java.util.Arrays;

public class PalindromeWords
{
	public static void main(String[] args)
	{
		String[] words = {"madam", "hello", "racecar", "java", "level", "world"};
		
		Object[] palindromeNames = Arrays.stream(words)
		  .map(word ->{
			StringBuilder name = new StringBuilder(word);
			name.reverse();
			String s1 = name.toString();
			if(word.equals(s1))
			{
				return name;
			}
			else
			{
				return null;
			}	
		}).filter(name1 -> name1!=null)
		  .toArray();
          IO.println("Palindrome words : "+Arrays.toString(palindromeNames));		

	}

}
