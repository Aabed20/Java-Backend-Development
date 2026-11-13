package com.food_order;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="OnlineFoodOrder")
@Data
public class FoodOrder 
{
	@Id
	private long orderId;
	
	private String customerName;
	
	private long customerMobileNumber;
	
	private String itemName;
	
	private double itemPrice;
	
	private int itemQuantity;
	
	private String restaurantName;
	
	private String paymentMode;
	
	private String deliveryAddress;
	
	private String status;
	
	private double totalAmount;

	/*public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustomerMobileNumber() {
		return customerMobileNumber;
	}

	public void setCustomerMobileNumber(long customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "FoodOrder [orderId=" + orderId + ", customerName=" + customerName + ", customerMobileNumber=" + customerMobileNumber
				+ ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemQuantity=" + itemQuantity
				+ ", restaurantName=" + restaurantName + ", paymentMode=" + paymentMode + ", deliveryAddress="
				+ deliveryAddress + ", status=" + status + ", totalAmount=" + totalAmount + "]";
	}*/

}
