package com.mobile.task;

public class Mobile
{
 private int mobileId;
 private String brand;
 private double price;
 
 public Mobile(int mobileId,String brand,double price)
 {
	 this.mobileId = mobileId;
	 this.brand = brand;
	 this.price = price;
 }
 
 public int getMobileId() {
	 return this.mobileId;
 }
 
 public String getBrand()
 {
	 return this.brand;
 }
	
 public double getPrice()
 {
	 return this.price;
 }
	
 public void display()
 {
	 System.out.println("Mobile Details :\nMobile Id : "+this.mobileId);
	 System.out.println("Brand : "+this.brand);
	 System.out.println("Price : "+this.price);
 }
	
}
