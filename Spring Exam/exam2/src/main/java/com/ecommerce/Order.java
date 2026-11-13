package com.ecommerce;

import java.util.Objects;

public class Order
{
 private int orderId;
 private String customerName;
 private String productName;
 private double amount;
 
 public Order() {}

 public int getOrderId() {
	return orderId;
 }

 public void setOrderId(int orderId) {
	this.orderId = orderId;
 }

 public String getCustomerName() {
	return customerName;
 }

 public void setCustomerName(String customerName) {
	this.customerName = customerName;
 }

 public String getProductName() {
	return productName;
 }

 public void setProductName(String productName) {
	this.productName = productName;
 }

 public double getAmount() {
	return amount;
 }

 public void setAmount(double amount) {
	this.amount = amount;
 }
 

 @Override
public int hashCode() {
	return Objects.hash(amount, customerName, orderId, productName);
}

 @Override
 public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Order other = (Order) obj;
	return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
			&& Objects.equals(customerName, other.customerName) && orderId == other.orderId
			&& Objects.equals(productName, other.productName);
 }

 @Override
 public String toString() {
	return "Order [orderId=" + orderId + ", customerName=" + customerName + ", productName=" + productName + ", amount="
			+ amount + "]";
 }
 
 
	 
}
