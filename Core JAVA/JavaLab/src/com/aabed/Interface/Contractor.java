package com.aabed.Interface;


public class Contractor {

	public static void main(String[] args)
	{
		Payable p1 = new Payable()
		{
            @Override
            public void pay()
            {
            	System.out.println("Paying to contractor");
            }
		};
		p1.pay();
	}
}
