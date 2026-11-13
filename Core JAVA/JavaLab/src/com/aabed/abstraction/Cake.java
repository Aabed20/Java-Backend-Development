package com.aabed.abstraction;

public class Cake {

	private String shape;
	private String flavour;
	private int quantity;
	public static double price = 400;
	public Cake(String shape, String flavour, int quantity) {
		super();
		this.shape = shape;
		this.flavour = flavour;
		this.quantity = quantity;
	}
	public String getShape() {
		return shape;
	}
	public String getFlavour() {
		return flavour;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "A "+getShape()+" "+getFlavour()+" Cake Of "+getQuantity()+" KG is Ready @ Rs."+(Cake.price*getQuantity());
	}
	
	
	
}
