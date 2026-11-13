package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("resources/application.properties")
public class Order 
{
	private Product product;
	
	private PaymentService payment;
	
	@Value("${shop.name}")
	private String shopName;
	
	@Autowired
	public Order(
	@Autowired	Product product,
	@Autowired	PaymentService payment)
	{
		this.product=product;
		this.payment=payment;
	}

	@Override
	public String toString() {
		return "Order [product=" + product + ", payment=" + payment.doPayment(product.getPrice())+", shopName=" + shopName + "]";
	}

}
