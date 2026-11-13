package com.food;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class Restaurant
{
 private ArrayList<String> menuItems;
 private LinkedHashSet<String> availableCuisines;
 private Map<String,Double> itemPrices;
 private List<String> deliveryAreas;
 
 public Restaurant() {}

 public ArrayList<String> getMenuItems() {
	return menuItems;
 }

 public void setMenuItems(ArrayList<String> menuItems) {
	this.menuItems = menuItems;
 }

 public LinkedHashSet<String> getAvailableCuisines() {
	return availableCuisines;
 }

 public void setAvailableCuisines(LinkedHashSet<String> availableCuisines) {
	this.availableCuisines = availableCuisines;
 }

 public Map<String, Double> getItemPrices() {
	return itemPrices;
 }

 public void setItemPrices(Map<String, Double> itemPrices) {
	this.itemPrices = itemPrices;
 }

 public List<String> getDeliveryAreas() {
	return deliveryAreas;
 }

 public void setDeliveryAreas(List<String> deliveryAreas) {
	this.deliveryAreas = deliveryAreas;
 }

 @Override
 public String toString() {
	return "Restaurant [menuItems=" + menuItems + ", availableCuisines=" + availableCuisines + ", itemPrices="
			+ itemPrices + ", deliveryAreas=" + deliveryAreas + "]";
 }	
	
}
