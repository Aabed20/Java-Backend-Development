package com.aabed.products_servlet;

public class ProductBean 
{
	private String product_id;
	private String product_name;
	private double product_price;
	private int product_qty;
	
	public ProductBean()
	{
		
	}

	public String getProduct_id() {
		return product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public double getProduct_price() {
		return product_price;
	}

	public int getProduct_qty() {
		return product_qty;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	public void setProduct_qty(int product_qty) {
		this.product_qty = product_qty;
	}
	

}
