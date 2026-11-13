package com.online;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("express")
public class ExpressDeliveryService implements DeliveryService {
	@Value("${appname}")
	private String applicationName;
	@Value("${company}")
	private String companyName;
	@Value("${customerName}")
	private String customerName;
	@Value("${orderId}")
	private int orderId;
	@Value("${productName}")
	private String productName;
	@Value("${productPrice}")
	private double productPrice;
	@Value("${deliveryCharge2}")
	private double DeliveryCharge;
	@Value("${tax}")
	private double tax;
	
	@Override
	public void deliverOrder() 
	{
		
		double taxAmount = productPrice*tax/100;
		double finalAmount = productPrice+taxAmount+DeliveryCharge;
        System.out.println("Order Details: ");
        System.out.println("Application Name : "+this.applicationName);
        System.out.println("Company Name : "+this.companyName);
        System.out.println("Customer Name : "+this.customerName);
        System.out.println("Orerd ID : "+this.orderId);
        System.out.println("Product Name : "+this.productName);
        System.out.println("Product Price :"+this.productPrice);
        System.out.println("Delivery Charge : "+this.DeliveryCharge);
        System.out.println("Tax amount : "+taxAmount);
        System.out.println("Final Bill Amount : "+finalAmount);
        System.out.println("Delivery done by Express Delivery Service");
        System.out.println("Delivery type : "+toString());
	}
	
	
	
	public String toString()
	{
		return "Express delivery";
	}

}
