package com.product;

public class Product
{
private int productId;
private String productName;
private int price;
public Product(int productId, String productName, int price) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.price = price;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
}


	
}
