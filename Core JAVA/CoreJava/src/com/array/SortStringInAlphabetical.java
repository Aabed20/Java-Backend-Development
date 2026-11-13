package com.array;

import java.util.Scanner;

public class SortStringInAlphabetical
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		IO.println("Enter String value : ");
		String val = sc.next();
		char ch[]=val.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]>ch[j])
				{
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] =temp;
				}
			}
		}
		
		String alphabetical = new String(ch);
		IO.println("Original String : "+val);
		IO.println("string in alphabetical order : "+alphabetical);
		
		sc.close();
	}

}
