package com.aabed.Exception_Handling;

public class ClassCastExceptionDemo
{
	public static void main(String[] args)
	{
		handleClassCastExcetion();
	}
	public static void handleClassCastExcetion()
	{
		Object[] a = {"Hello",123,"Java"};
		
		for(int i=0;i<a.length;i++)
		{
		try
		{
				String str = (String) a[i];
				IO.println("Casting successful: "+str);	
		}
		catch(ClassCastException e)
		{
			e= new ClassCastException("Cannot cast "+a[i].getClass().getName()+" to String.");
			IO.println("ClassCastException: "+e.getLocalizedMessage());
			e.printStackTrace();
		}
		}	
	}

}
