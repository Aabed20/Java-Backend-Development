package com.food;

public class FoodOrder
{
 private int orderId;
 private String foodName;
 private DeliveryPartner deliveryPartner;
 
 public FoodOrder() {}

 public int getOrderId() {
	return orderId;
 }

 public void setOrderId(int orderId) {
	this.orderId = orderId;
 }

 public String getFoodName() {
	return foodName;
 }

 public void setFoodName(String foodName) {
	this.foodName = foodName;
 }

 public DeliveryPartner getDeliveryPartner() {
	return deliveryPartner;
 }

 public void setDeliveryPartner(DeliveryPartner deliveryPartner) {
	this.deliveryPartner = deliveryPartner;
 }

 @Override
 public String toString() {
	return "FoodOrder [orderId=" + orderId + ", foodName=" + foodName + ", deliveryPartner=" + deliveryPartner + "]";
 }
 
 
 
	
}
