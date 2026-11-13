package aabed;

public class Human {

	String name;
	int age;
	double height;
	String job;
	double speed;
	
	public void getInformationOfHuman()
	{
		System.out.println("Hello Everyone My name is "+name);
		System.out.println("I'm a "+job);
		System.out.println("My Age is "+age+" and I'm "+height);
	}
	public void talk()
	{
		System.out.println("I have good Communication");
		System.out.println("I can speak Hindi, Marathi, Urdu, English");
	}
	public void run()
	{
		System.out.println("I can Run very fast.");
	}
}
