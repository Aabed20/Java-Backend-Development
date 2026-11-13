package blc;

public class Product {

	private int id;
	private String name;
	private double price;
	private double discount;
	
	public void setProductDetails(int id, String name, double price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		
	}
	
	public void calculateDiscount()
	{
		if(price<1000)
		{
			discount = price*0.05;
			price-=discount;
			System.out.println("Discount Amount: "+discount);
			System.out.println("Price After Discount: "+price);
		}
		else if(price>=1000&&price<=5000)
		{
			discount = price*0.1;
			price-=discount;
			System.out.println("Discount Amount: "+discount);
			System.out.println("Price After Discount: "+price);
		}
		else if(price>5000)
		{
			discount = price*0.15;
			price-=discount;
			System.out.println("Discount Amount: "+discount);
			System.out.println("Price After Discount: "+price);
		}
		else {
			discount =0;
		}
	
	}

	
	public String toString() {
		System.out.println("----- Product Details -----");
		return "Product [productId=" + id + ", productName=" + name + ", productPrice=" + price + "]";
	}
	
	
}
