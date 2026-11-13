package com.aabed.Exception_Handling;



class ParentClass
{
	public void loadingClass(String str) throws ClassNotFoundException
	{
		Class.forName(str);
		IO.println("Class "+str+" loaded successfully.");
	}
}

class ChildClass extends ParentClass
{
	@Override
	public void loadingClass(String str) throws IllegalArgumentException, ClassNotFoundException
	{
		if(str.isBlank()||str==null ||str.equals(""))
		{
			throw new IllegalArgumentException();
		}
		else
		{
			super.loadingClass(str);
		}
	}
	
}

public class Tester
{
	public static void main(String[] args)
	{
		
		ChildClass c1 = new ChildClass();
         
		try
		{
			for(int i=0; i<=args.length;i++)
			{
				c1.loadingClass(args[i]);
      			
			}
		}
		catch(ClassNotFoundException e)
		{
			IO.println("Error: Class not found - "+args[0]);
		}
		catch(IllegalArgumentException e)
		{
			IO.println("Illegal Argument pass a Fully qualified name of class ");	
		}
		
	}

}
