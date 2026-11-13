package com.food;

import org.springframework.stereotype.Component;

@Component("upi")
public class UPIPayment implements PaymentService {

	@Override
	public void pay() 
	{
		System.out.println("Payment done using UPI");

	}
	
	public String toString()
	{
		return "UPI ";
	}

}
