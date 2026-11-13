package com.aabed.multithreading;

public class Synchronization_demo2 
{
	public static void main(String[] args) 
	{
		Action ac = new Action();
		Person r = new Person("Ramesh",ac);
		r.start();
		Person s = new Person("Suresh",ac);
		s.start();

	}
}

class Person extends Thread
{
	String name;
    Action ac;
	
	public Person(String name,Action ac)
	{
		this.name=name;
		this.ac=ac;
	}
	
	public void run()
	{
		ac.jump(name);
		ac.walk(name);
		//ac.eat(name);
	}
	
	
}

class Action
{
   
   public void jump(String name)
   {
	   System.out.println(name+" is jumping");
   }
   
   public void walk(String name)
   {
	   System.out.println(name+" is walking");
   }
 
   public void eat(String name)
   {
	   System.out.println(name+" is eating");
   }
}
