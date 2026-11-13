package com.small_shop;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(OperationConfig.class);

		OperationDao bean = context.getBean(OperationDao.class);
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. Get product Price");
			System.out.println("2. Get All Products");
			System.out.println("3. Insert Product");
			System.out.println("4. Delete product");
			System.out.println("5. Update Product");
			System.out.println("6. Find and Count by Product Name");
			System.out.println("7. Display Products by Shipping Address");
			System.out.println("8. Exit");
			System.out.print("\nEnter your choice :");
			int choice = Integer.parseInt(sc.nextLine());
			switch(choice)
			{
			case 1 : 
				{
					System.out.print("Enter Product Name : ");
					String name = sc.nextLine();
					double price = bean.getPriceByName(name);
					if(price>0)
					{
					System.out.println("Price : "+bean.getPriceByName(name));
					}
					else
					{
						System.out.println("product with name "+name+" is not found");
					}
					break;
				}
			case 2 : 
			{
				System.out.println("All Product details are : ");
				List<ProductDelivery> allProducts = bean.allProducts();
				if(allProducts.size()!=0)
				{
					allProducts.forEach(System.out::println);
				}
				else
				{
					System.out.println("No products are available");
				}
				break;
			}
			case 3 :
			{
				System.out.print("Enter Product Name : ");
				String name = sc.nextLine();
				System.out.print("Enter Shipping address : ");
				String add= sc.nextLine();
				System.out.print("Enter price for Product :");
				float price = Float.parseFloat(sc.nextLine());
				System.out.print("Enter quantity for Product :");
				int quantity = Integer.parseInt(sc.nextLine());
				System.out.print("Enter Placed Date :");
				String placedDate = sc.nextLine();
				ProductDelivery product = new ProductDelivery();
				product.setProuductName(name);
				product.setProductShippingAddress(add);
				product.setProductPrice(price);
				product.setProductQuantity(quantity);
				product.setProductPlaceDate(placedDate);
				int isInserted=bean.insertProduct(product);
				if(isInserted==1)
				{
					System.out.println("Product Inserted Successfully!!");
				}
				else
				{
					System.out.println("Product Not Inserted");
				}
				break;
			}
			case 4 :
			{
				System.out.print("Enter Product Name which you want to delete : ");
				String name = sc.nextLine();
				int isDeleted = bean.deleteProduct(name);
				if(isDeleted==1)
				{
					System.out.println("product Deleted successfully!!!");
				}
				else
				{
					System.out.println("Product not deleted");
				}
				break;
			}
			case 5 :
			{
				System.out.print("Enter Product Name which you want to update : ");
				String name = sc.nextLine();
				System.out.print("Enter new Shipping address : ");
				String add= sc.nextLine();
				System.out.print("Enter new Placed Date :");
				String placedDate = sc.nextLine();
				int isUpdated = bean.updateProduct(add, placedDate, name);
				if(isUpdated==1)
				{
					System.out.println("Product Record updated successfully!!!");
				}
				else
				{
					System.out.println("Product Record not updated");
				}
				break;
			}
			case 6 :
			{
				System.out.print("Enter Product name to find & count products: ");
				String name = sc.nextLine();
				int counts = bean.CountMatchingProducts(name);
				if(counts!=0)
				{
				System.out.println(counts+" are matching with "+name+" name");
				}
				else
				{
					System.out.println("No matching product found");
				}
				break;
			}
			case 7 :
			{
				System.out.print("Enter Shipping address : ");
				String address = sc.nextLine();
				List<ProductDelivery> products = bean.productsByShippingAddress(address);
				if(products.size()!=0)
				{
				System.out.println("The list of products delivering to "+address+" Address :");
				products.forEach(System.out::println);
				}
				else
				{
					System.out.println("No products with Shipping address : "+address+" available");
				}
				
				break;
			}
			case 8 :
			{
				System.out.println("Thank you for choosing our application!!!");
				System.exit(0);
				break;
			}
			default :
			{
				System.out.println("Choose a valid option from 1-8");
			}
			}
		}
	}

}
