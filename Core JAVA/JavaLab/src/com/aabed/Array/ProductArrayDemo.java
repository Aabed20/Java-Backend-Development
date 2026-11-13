package com.aabed.Array;
import java.util.*;

public class ProductArrayDemo {

	public static void main(String[] args) {
     
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("Enter number of products: ");
		int productSize = sc.nextInt();
		System.out.println("");
		
		Product p[] = new Product[productSize];
		
		for(int i=0; i<productSize; i++) {
			
			System.out.println("Enter details for product "+(i+1)+":");
			System.out.print("Enter Prouct ID: ");
			int id = sc.nextInt();
			System.out.print("Enter Product Name: ");
			String name = sc.next();
			System.out.print("Enter Product Price: ");
			double price = sc.nextDouble();
			p[i]= new Product(id,name,price);
			System.out.println("");
		}
		
		System.out.print("Enter Product ID to search: ");
		int searchProduct = sc.nextInt();
		
		for(int i=0; i<productSize; i++) {
			
			if(p[i].getId()==searchProduct) {
				System.out.println("Product Found: "+p[i]);
				System.exit(0);
			}
		}
		System.out.println("Product with ID "+searchProduct+" not found.");
		System.exit(0);
		
	}

}
