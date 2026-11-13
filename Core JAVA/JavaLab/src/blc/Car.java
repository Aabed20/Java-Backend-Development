package blc;

public class Car {

	private String model;
	private int year;
	private double price;
	public Car(String model, int year, double price) {
		
		this.model = model;
		this.year = year;
		this.price = price;
	
	}
	
	public String toString() {
		if(year<2011) {
			return"year must be greater than 2010";
		}
		else if(price<0) {
			return"Price must be positive integer";
		}

		else {
			return "Car [model=" + model + ", year=" + year + ", price=" + price + "]";

		}
		
}}
