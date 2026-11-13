package com.small_shop;

public class ProductDelivery 
{
	private String prouductName;
	private String productShippingAddress;
	private float productPrice;
	private int productQuantity;
	private String productPlaceDate;
	
	public ProductDelivery() {
		super();
	}
	public String getProuductName() {
		return prouductName;
	}
	public void setProuductName(String prouductName) {
		this.prouductName = prouductName;
	}
	public String getProductShippingAddress() {
		return productShippingAddress;
	}
	public void setProductShippingAddress(String productShippingAddress) {
		this.productShippingAddress = productShippingAddress;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductPlaceDate() {
		return productPlaceDate;
	}
	public void setProductPlaceDate(String productPlaceDate) {
		this.productPlaceDate = productPlaceDate;
	}
	@Override
	public String toString() {
		return "ProductDelivery [prouductName=" + prouductName + ", productShippingAddress=" + productShippingAddress
				+ ", productPrice=" + productPrice + ", productQuantity=" + productQuantity + ", productPlaceDate="
				+ productPlaceDate + "]";
	}

}
