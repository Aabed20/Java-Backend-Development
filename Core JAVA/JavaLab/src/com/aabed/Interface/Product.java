package com.aabed.Interface;

public abstract class Product {

	private String name;
	private double price;
	private String category;
	public Product(String name, double price, String category) {
		super();
		if(name.isBlank())
		{
			System.err.println("Product name cannot be empty or null.");
			System.exit(0);
		}
		else 
		{
		this.name = name;
		}
		if(price<=0)
		{
			System.err.println("Price cannot be negative Or Zero.");
			System.exit(0);
		}
		else
		{
		this.price = price;
		}
		if(category.isBlank())
		{
			System.err.println("Category cannot be empty or null.");
			System.exit(0);
		}
		else
		{
		this.category = category;
		}
	}
	public String getName() {
		return name;
	}
	public String getCategory() {
		return category;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract void applyDiscount(double percentage);
	public abstract double calculateTax();
	@Override
	public String toString() {
		return "Product Name: "+this.name+"\nCategory: "+this.category+"\nPrice RS:"+this.price;
	}

}
