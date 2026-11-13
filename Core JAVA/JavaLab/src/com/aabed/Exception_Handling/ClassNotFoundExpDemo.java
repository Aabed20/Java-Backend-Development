package com.aabed.Exception_Handling;

public class ClassNotFoundExpDemo
{
	public static void main(String[] args)
	{
		String str = IO.readln("Enter the class name to load: ");
		new ClassNotFoundExpDemo(str);

	}
	
	public ClassNotFoundExpDemo(String s)
	{
		try
		{
		Class<?> a = Class.forName(s);
		IO.println("Class loaded successfully: "+a.getName());
		}
		catch(ClassNotFoundException e)
		{
			IO.println("Error: Class '"+s+"' not found.");
			e.printStackTrace();
		}
	}

}
