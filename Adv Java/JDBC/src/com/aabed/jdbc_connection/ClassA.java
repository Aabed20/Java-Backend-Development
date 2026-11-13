package com.aabed.jdbc_connection;

public class ClassA
{

	static InterfaceA display(String s1, String s2, String s3)
	{
		IO.println("display() method called");
		
		return new InterfaceA()
		{
			@Override
			public void msg1()
			{
				IO.println("Java is awesome");
			}
			@Override
			public void msg2()
			{
				IO.println("Java is amazing");
			}
			};
	}
}
