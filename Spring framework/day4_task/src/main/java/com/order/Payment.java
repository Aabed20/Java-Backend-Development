package com.order;

public class Payment
{
	private int paymentId;
	private String paymentMode;
	
	public Payment()
	{}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentMode=" + paymentMode + "]";
	}
	
	

}
