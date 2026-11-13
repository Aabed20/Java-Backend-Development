package elc;

import java.util.Scanner;

import blc.Products;

public class ProductsDemo {

	public static void main (String[] args)
	{
		Products laptop = new Products();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Name ");
		String name = sc.nextLine();
		System.out.println("Enter product Id ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter product type");
		String type = sc.nextLine();
		System.out.println("Enter product price");
		double price = Double.parseDouble(sc.nextLine());
		sc.close();
		laptop.setProductData(id, name,type, price);
		laptop.getProductInfo();
		
	}
}
