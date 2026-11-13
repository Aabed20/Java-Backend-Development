package com.aabed.Interface;

public class ShoppingCart
{
	
	private double totalAmount;

	public ShoppingCart(double totalAmount) {
		super();
		this.totalAmount = totalAmount;
	}
	
	public void checkout(Payment p)
	{
		p.makePayment(totalAmount);
		
	}
	
	public void cancelOrder(Payment p)
	{
		p.makeRefund(totalAmount);
	}
	

}
