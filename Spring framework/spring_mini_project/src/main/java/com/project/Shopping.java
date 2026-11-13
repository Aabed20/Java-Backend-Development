package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Shopping 
{    
	@Autowired
	private Payment payment;
	
	public void paymentVerification()
	{
		if(payment.paymentVerification())
		{
			System.out.println("Payment Verification done successfully");
			System.out.println("Payment done using "+type());
		}
		else
		{
			System.out.println("Payment not verified");
		}
	}
	
	public String type()
	{
		if(payment instanceof Card)
		{
			return((Card) payment).getCardName();
		}
		else if(payment instanceof Paytm)
		{
			return "Paytm";
		}
		else if(payment instanceof PhonePe)
		{
			return "PhonePe";
		}
		else if(payment instanceof Gpay)
		{
			return "GooglePay";
		}
		else
		{
			return null;
		}
	}

}
