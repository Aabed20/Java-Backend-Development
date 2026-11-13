package com.aabed.Exception_Handling;

public class IllegalStateExceptionDemo 
{
	public static void main(String[] args)
	{
	   IO.println("Calling throwIllegalException from main method : ");
	   throwIllegalException();
	}
	
	static void throwIllegalException()
	{
		try
		{
			throw new IllegalStateException("MyException");
		}
		catch(IllegalStateException objA)
		{
			IO.println("Caught : "+objA);
		}
	}

}
