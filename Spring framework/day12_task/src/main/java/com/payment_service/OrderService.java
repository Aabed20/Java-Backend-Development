package com.payment_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService
{
	PaymentService paymentService;
	
	public OrderService() {}

	public PaymentService getPaymentService() {
		return paymentService;
	}

	@Autowired
	@Qualifier("upiPayment")
	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	

}
