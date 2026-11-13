package com.aabed.Interface;

public class DigitalProduct extends Product
{
	private String licenseKey;
	private double discount;
	private double total;

	public DigitalProduct(String name, double price, String category, String licenseKey) {
		super(name, price, category);
		this.licenseKey = licenseKey;
	}

	@Override
	public void applyDiscount(double percentage) {
		 discount = super.getPrice()*percentage/100; 
		 total = super.getPrice()-(super.getPrice()*percentage)/100;
		System.out.println("Discount applied :"+discount);
		System.out.println("New Price :"+total);
		System.out.println("Tax RS : "+calculateTax());
	}

	@Override
	public double calculateTax() {
		double tax = total*0.05;
		
		return tax;
	}
	
	public String toString()
	{
		return "Digital Product :\n"+super.toString()+"\nLicense Key: "+this.licenseKey;
	}
	

}
