package com.ecommerce;

import java.util.Objects;

public class ProductOrder
{

private int orderId;
private String productName;
private String customerName;
private double price;

public ProductOrder() {}

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

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public int hashCode() {
	return Objects.hash(customerName, orderId, price, productName);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	ProductOrder other = (ProductOrder) obj;
	return Objects.equals(customerName, other.customerName) && orderId == other.orderId
			&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
			&& Objects.equals(productName, other.productName);
}

@Override
public String toString() {
	return "ProductOrder [orderId=" + orderId + ", productName=" + productName + ", customerName=" + customerName
			+ ", price=" + price + "]";
}

}
