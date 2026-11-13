//Assignment 02 :
//---------------
//Design an inventory system for a retail store :
//  
//InventoryItem Class: [BLC Class]
//
//Create an InventoryItem class with the following 
// 
//Instance Variables:(private for all the fields)
//------------------------------------------------
//Name			dataType
//---------		-----------
//itemName        	String 
//pricePerUnit    	double 
//quantityInStock 	int 
//
//Implement a constructor that takes parameters to initialize the attributes of the InventoryItem object. [Validation is not reqd for this program]
//
//Provide getter and setter methods for each attribute to ensure proper encapsulation.
//
// Method:
//-------------
//MethodName  	        :calculateTotalValue()
//Return Type		:double
//Access Modifier 	:public
//
//This method should calculate and return the total value of the inventory item in stock, which is the product of the price per unit and the quantity in stock.
//
//Take a InventoryMain class (ELC Class) which is having  main method to  Create Object for inventory class and print complete details by using the method calculateTotalValue().
//
//IF WE HAVE ANY NEW UPDATION IN STOCK LIKE ITEM PRICE OR ITEM QUANTITY THEN
//CALL SETTER METHOD TO UPDATE THE NEW PRICE OR NEW QUANTITY.[See the Test
//cases for more details]
//
//If any update in stock is there then take the new price OR new quantity from user otherwise shutdown JVM using System.exit(0).
//
//Test Cases for Output
//-------------------
//Test Case 01 :
//--------------
//Enter Item Name: Laptop
//Enter Price Per Unit: 80000
//Enter Quantity In Stock: 10
//
//Inventory Item Details:
//Item Name: Laptop
//Price Per Unit: 80000.0
//Quantity in Stock: 10
//Total Inventory Value: 800000.00
//Any updation in Stock Price OR Quantity :NO
//
//Test Case 02 :
//--------------
//Enter Item Name: Laptop
//Enter Price Per Unit: 80000
//Enter Quantity In Stock: 10
//
//Inventory Item Details:
//Item Name: Laptop
//Price Per Unit: 80000.0
//Quantity in Stock: 10
//Total Inventory Value: 800000.00
//Any updation in Stock Price OR Quantity :Yes
//Enter New Price Per Unit :90000
//Enter New Quantity In Stock: 5
//
//Updated Inventory Item Details:
//Item Name: Laptop
//Price Per Unit: 90000.0
//Quantity in Stock: 5
//Total Inventory Value: 450000.00
package blc;

public class InventoryItem {

	private String itemName;
	private double pricePerUnit;
	private int quantityInStock;
	public InventoryItem(String itemName, double pricePerUnit, int quantityInStock) {
		super();
		this.itemName = itemName;
		this.pricePerUnit = pricePerUnit;
		this.quantityInStock = quantityInStock;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public int getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	
	public void getDetails()
	{
		System.out.println("Inventory Item Details: ");
		System.out.println("Item Name: "+itemName);
		System.out.println("Price Per Unit: "+pricePerUnit);
		System.out.println("Quantity in Stock: "+quantityInStock);
		System.out.println("Total Inventory Value: "+pricePerUnit*quantityInStock);
	}
	
	
	
}
