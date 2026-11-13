package com.beans;

public class PaymentService 
{
	private String paymentMode;
	
	private String paymentCurrency;
	
	private double amount;
	
	public PaymentService() {}

	public String getPaymentMode() {
		return paymentMode;
	}

	
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getPaymentCurrency() {
		return paymentCurrency;
	}

	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

	
	public String doPayment(double amount)
	{
		return "Payment Done of "+amount+"\npayment mode : "+this.paymentMode+"\npayment currency : "+this.paymentCurrency;
	}

}
