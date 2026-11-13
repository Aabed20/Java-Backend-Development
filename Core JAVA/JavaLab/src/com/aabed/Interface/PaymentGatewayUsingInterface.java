package com.aabed.Interface;

import java.util.Scanner;

public class PaymentGatewayUsingInterface
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Payment Type [CreditCard / UPI]:");
		String choice = sc.nextLine();
		PaymentGateway pg = new PaymentGateway();
		Payment1 pay= pg.initiatePayment(choice);
		if(choice.equalsIgnoreCase("creditcard"))
		{
          
          pay.processPayment();
          pay.applyDiscount();
           
		}
		else if(choice.equalsIgnoreCase("upi"))
		{
			 pay.processPayment();
	          pay.applyDiscount();
			
		}
		else
		{
			System.out.println("Invalid payment type selected!");
		}

	}

}
