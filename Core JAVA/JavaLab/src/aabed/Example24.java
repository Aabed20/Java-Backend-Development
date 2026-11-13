package aabed;
class Example24   
{
	static 
	{
		a = m1(); //50 
	}

	static int a = 80;

	public static void main(String[] args) 
	{
		System.out.println(a);
	}

	static 
	{
		a = a + m1();  
	}

	static int m1() 
	{
		a = 30;
		return m2();
	}

	static int m2() 
	{
		System.out.println(a);
		return a + 20;
	}
}

