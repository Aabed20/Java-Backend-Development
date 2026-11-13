package com.aabed.Interface;

public class PhysicalProduct extends Product
{
	private double shippingweight;
	private double discount;
	private double total;

	public PhysicalProduct(String name, double price, String category, double shippingweight) {
		super(name, price, category);
		if(shippingweight<=0)
		{
			System.err.println("Weight cannot be negtaive in negative");
			System.exit(0);
		}
		this.shippingweight = shippingweight;
	}
    @Override
	public void applyDiscount(double percentage) {
		 discount = super.getPrice()*percentage/100; 
		total = super.getPrice()-(super.getPrice()*percentage)/100;
		System.out.println("Discount applied :"+discount);
		System.out.println("New Price :"+total);
		System.out.println("Tax RS : "+calculateTax());
		System.out.println("Shipping Cost RS :"+calculateShippingCost());
	}

	@Override
	public double calculateTax() {
		double tax = total*0.08;
		return tax;
	}
	
	public double calculateShippingCost()
	{
		double costOfShipping = this.shippingweight*5;
		return costOfShipping;
	}
	
	public String toString()
	{
		return "Physical Product:\n"+super.toString()+"\nShipping Weight: "+this.shippingweight+" kg";
	}

	
}
