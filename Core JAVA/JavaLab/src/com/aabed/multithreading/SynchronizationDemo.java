package com.aabed.multithreading;

public class SynchronizationDemo {

	public static void main(String[] args)
	{
		WashRoom ws1 = new WashRoom();
		Thread03 r = new Thread03(ws1,"Ramesh");
		r.start();
		Thread03 s = new Thread03(ws1,"Suresh");
		s.start();

	}

}

class Thread03 extends Thread
{
	String name;
	WashRoom obj;
	public Thread03(WashRoom obj, String name)
	{
		this.obj=obj;
		this.name=name;
	}
	public void run()
	{
		obj.useWashRoom(name);
		obj.attendInterview(name);
	}
}
class WashRoom
{
	public synchronized void useWashRoom(String name)
	{
		System.out.println(name+" is Entering Washroom");
		System.out.println(name+" is Taking bath");
		System.out.println(name+" is coming out of the washroom");
	}
	public void attendInterview(String name)
	{
		System.out.println(name+": get ready..!!");//both
		System.out.println(name+" had breakfast...");//both
		System.out.println(name+" took a bus to company");//both
		System.out.println(name+" waiting in the hall for interview");//both
		synchronized(this)
		{
			System.out.println(name+" entering the interview room");//only one
			System.out.println(name+" introduction of the candidate");//only one
			System.out.println(name+" answer the asked questions");//only one
			System.out.println(name+" coming out of the interview room");//only one
		}
		System.out.println(name+" coming back to pg in bus");//both
	}

}
