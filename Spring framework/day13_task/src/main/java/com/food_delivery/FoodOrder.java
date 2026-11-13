package com.food_delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FoodOrder 
{
	PaymentService paymentService;
	
	public FoodOrder() {}

	public PaymentService getPaymentService() {
		return paymentService;
	}
    
	@Autowired()
	@Qualifier("upi")
	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	

}
