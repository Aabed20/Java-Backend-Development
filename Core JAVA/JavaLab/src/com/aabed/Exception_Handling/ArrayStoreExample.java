package com.aabed.Exception_Handling;

public class ArrayStoreExample 
{
	public static void main(String[] args)
	{
		
		try
		{
			storeObjects();
			IO.println("Objects stored successfully.");
		}
		catch(ArrayStoreException e)
		{
			IO.println("ArrayStoreException caught: Incompatible type: "+e.getLocalizedMessage()+" cannot be stored in an array of java.lang.String");
		}
		

	}
	
	public static void storeObjects()
	{
		Object[] strings = new String[5];
		
		strings[0]= "Hello";
		strings[1]="World";
		strings[2]="Java";
		strings[3]='c';
		strings[4]="abc";
	}

}
