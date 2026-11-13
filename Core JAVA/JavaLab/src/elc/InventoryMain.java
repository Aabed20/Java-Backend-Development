package elc;

import java.util.Scanner;

import blc.InventoryItem;

public class InventoryMain {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Item Name: ");
		String itemName = sc.nextLine();
		System.out.print("Enter Price Per Unit: ");
		double pricePerUnit = Double.parseDouble(sc.nextLine());
		System.out.print("Enter Quantity In Stock: ");
		int quantityInStock = Integer.parseInt(sc.nextLine());
		System.out.println("------------------------------");
		
		InventoryItem item1 = new InventoryItem(itemName, pricePerUnit, quantityInStock);
		
		item1.getDetails();
		
		System.out.println("Any updation in Stock Price OR Quantity : ");
		String choice = sc.nextLine();
		
		if(choice.equalsIgnoreCase("Yes"))
		{
			
			System.out.print("Enter New Price Per Unit : ");
			pricePerUnit = Double.parseDouble(sc.nextLine());
			item1.setPricePerUnit(pricePerUnit);
			
			System.out.print("Enter New Quantity In Stock: ");
			quantityInStock = Integer.parseInt(sc.nextLine());
			item1.setQuantityInStock(quantityInStock);
			System.out.println("-------------------");
			
			System.out.println("Updated Inventory Item Details:");
			item1.getDetails();
			
		    System.exit(0);
		}
		else {
			System.exit(0);
		}
		sc.close();
	}

}
