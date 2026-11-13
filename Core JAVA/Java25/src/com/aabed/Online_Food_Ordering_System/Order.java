package com.aabed.Online_Food_Ordering_System;

import java.util.ArrayList;

public class Order 
{
	
	public static void main(String[] args)
	{
		Restaurant shadab = new Restaurant();
		
		FoodItem [] listofItems = new FoodItem[10];
		
		listofItems[0]= new FoodItem("Chiken Biryani",350d,500);
		listofItems[1]= new FoodItem("Mutton Biryani",400d,500);
		listofItems[2]= new FoodItem("Chiken 65",300d,200);
		listofItems[3]= new FoodItem("Chiken Leg Piece",250d,2);
		listofItems[4]= new FoodItem("Mutton korma",320d,250);
		listofItems[5]= new FoodItem("Butter Chiken Gravy",450d,450);
		listofItems[6]= new FoodItem("Rumali Roti ",50d,1);
		listofItems[7]= new FoodItem("Zeera Rice",200d,500);
		listofItems[8]= new FoodItem("Gulab Jamun",350d,3);
		listofItems[9]= new FoodItem("Double ka Meetha",300d,4);
		
		IO.println(shadab);
	}
	
	public String toString()
	{
		return "Order Info";
	}
}
