package com.aabed.Online_Food_Ordering_System;

public record FoodItem(String foodItems, Double price, Integer quantityAvailable  ) 
{

	@Override
	public String toString() 
	{
		return "Item Name : " + foodItems + ", price : " + price + ", quantity : " + quantityAvailable+"\n";
	}
	
}
