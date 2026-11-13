package com.aabed.Online_Food_Ordering_System;

public class Customer 
{
	private int customerId;
	private String customerName;
	private String mobileNumber;
	private String deliveryAddress;
	private double distance;
	public Customer(int customerId, String customerName, String mobileNumber, String deliveryAddress, double distance) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.deliveryAddress = deliveryAddress;
		this.distance = distance;
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public double getDistance() {
		return distance;
	}
	@Override
	public String toString() {
		return "Customer [customerId : " + customerId + ", customerName : " + customerName + ", mobileNumber : "
				+ mobileNumber + ", deliveryAddress : " + deliveryAddress + ", distance : " + distance + "]";
	} 
	
	
	
	

}
