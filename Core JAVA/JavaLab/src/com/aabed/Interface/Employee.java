package com.aabed.Interface;

public class Employee {

	public static void main(String [] args)
	{
		Payable p2 = new Payable()
		{
		  @Override
		  public void pay()
		  {
			System.out.println("Paying to Employee");  
		  }
		};
		p2.pay();
	}
}
