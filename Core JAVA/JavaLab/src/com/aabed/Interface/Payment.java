package com.aabed.Interface;

public sealed interface Payment permits DebitCardPayment, CreditCardPayment1, UPIPayment
{	
  
	void makePayment(double amount);
	void makeRefund(double amount);
}


