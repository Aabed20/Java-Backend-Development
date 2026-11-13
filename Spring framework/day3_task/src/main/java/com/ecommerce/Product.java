package com.ecommerce;

public class Product
{
	private int productId;
	private String productName;
	private String category;
    private double price;
    private String brand;
    
	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", price=" + price + ", brand=" + brand + "]";
	}
    
    

}
