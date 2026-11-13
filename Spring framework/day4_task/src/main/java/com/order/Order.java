package com.order;

public class Order
{
 private int orderId;
 private String productName;
 private Payment payment;
 
 public Order()
 {}

 public int getOrderId() {
	return orderId;
 }

 public void setOrderId(int orderId) {
	this.orderId = orderId;
 }

 public String getProductName() {
	return productName;
 }

 public void setProductName(String productName) {
	this.productName = productName;
 }

 public Payment getPayment() {
	return payment;
 }

 public void setPayment(Payment payment) {
	this.payment = payment;
 }

 @Override
 public String toString() {
	return "Order [orderId=" + orderId + ", productName=" + productName + ", payment=" + payment + "]";
 }
 
}
