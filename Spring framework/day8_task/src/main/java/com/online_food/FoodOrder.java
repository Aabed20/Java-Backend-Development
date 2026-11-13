package com.online_food;

import java.util.Objects;

public class FoodOrder
{
	private int orderId;
	private String customerName;
	private String foodItem;
	private double amount;
	
	public FoodOrder() {
		super();
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getFoodItem() {
		return foodItem;
	}
	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(amount, customerName, foodItem, orderId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodOrder other = (FoodOrder) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(customerName, other.customerName) && Objects.equals(foodItem, other.foodItem)
				&& orderId == other.orderId;
	}
	@Override
	public String toString() {
		return "FoodOrder [orderId=" + orderId + ", customerName=" + customerName + ", foodItem=" + foodItem
				+ ", amount=" + amount + "]";
	}

}
