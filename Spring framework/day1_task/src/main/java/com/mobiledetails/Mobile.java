package com.mobiledetails;

public class Mobile
{
	private int mobileId;
	private String brand;
	private double price;
	
	public Mobile()
	{}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
}
