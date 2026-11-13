package com.aabed.Online_Food_Ordering_System;

import java.util.ArrayList;

public class Restaurant
{
  private static String restaurantName = "SHADAB";
  private static String phoneNumber = "7558555939";
  private static String address = "500016 Ameerpet, Hyderabad";
  
  private ArrayList<FoodItem> foodItems;
 
  public void addItems(FoodItem []fooditems)
  {  
	  for(FoodItem istems: fooditems)
	  {
		  foodItems.add(istems);
	  }	 
  }

  @Override
  public String toString() 
  {
	return "Restaurant "+restaurantName+"\nLocated in "+address+"\nContact Info : Phone Number "+phoneNumber+"\n\tList Of Items \n"+foodItems.toString();
  }
}
