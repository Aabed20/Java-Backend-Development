package com.online_shopping;

import java.util.List;

public class ShoppingCart
{
 private List<Product> products;
 
 
 public ShoppingCart(List<Product> products) {
	super();
	this.products = products;
}



 public List<Product> getProducts() {
	return products;
 }

 public void setProducts(List<Product> products) {
	this.products = products;
 }
 
 public void displayData()
 {
	 double amount = 0.0;
	 
	 for(Product p:products)
	 {
		 System.out.println(p);
		 amount+=p.getPrice();
	 }
	 System.out.println("Total Amount : "+amount);
 }

 @Override
 public String toString() {
	return "ShoppingCart [products=" + products + "]";
 }
	
}
