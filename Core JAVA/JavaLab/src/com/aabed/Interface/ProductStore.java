package com.aabed.Interface;

import java.util.Scanner;

public class ProductStore 
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Select Product Type:\n1. Digital Product\n2. Physical Product");
       Product p;
      int choice = Integer.parseInt(sc.nextLine());
      if(choice==1)
      {
    	  System.out.print("Enter Digital Product Name :");
    	  String name = sc.nextLine();
          System.out.print("Enter Product Price :");
          double price = Double.parseDouble(sc.nextLine());
          System.out.print("Enter Product Category :");
          String category =sc.nextLine();
          System.out.print("Enter Product License Key :");
          String licenseKey = sc.nextLine();
          System.out.println("Enter the discount % on final bill");
          double discount = Double.parseDouble(sc.nextLine());
          
           p = new DigitalProduct(name,price,category,licenseKey);
           System.out.println(p);
           p.applyDiscount(discount);
           
      }
      else if(choice==2)
      {
    	  System.out.print("Enter Physical Product Name :");
    	  String name = sc.nextLine();
          System.out.print("Enter Product Price :");
          double price = Double.parseDouble(sc.nextLine());
          System.out.print("Enter Product Category :");
          String category =sc.nextLine();
          System.out.print("Enter Product weight :");
          double shippingWeight = Double.parseDouble(sc.nextLine());
          System.out.println("Enter the discount % on final bill");
          double discount = Double.parseDouble(sc.nextLine());
          
          p = new PhysicalProduct(name,price,category,shippingWeight);
          System.out.println(p);
          p.applyDiscount(discount);
      }
      sc.close();
      
	}

}
