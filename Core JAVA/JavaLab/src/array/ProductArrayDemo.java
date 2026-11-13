package array;
import java.util.*;

class Product
{
	private int id;
	private String name;
	private double price;
	
	public Product(int id, String name, double price)
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId()
	{
		return this.id;
	}
	@Override
	public String toString()
	{
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}	
}
public class ProductArrayDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		IO.print("Enter number of products: ");
		IO.println();
		int size=sc.nextInt();
		Product products[]= new Product[size];
		for(int i=0; i<size; i++)
		{
		  IO.println("Enter details for Product "+(i+1)+":");
		  IO.print("Enter Product ID: ");
		  int id = sc.nextInt();
		  IO.print("Enter Product Name: ");
		  String name = sc.next();
		  IO.print("Enter Product Price: ");
		  double price=sc.nextDouble();
		  products[i]= new Product(id, name, price);
		  IO.println();
		}
		IO.print("Enter Product ID to search: ");
		int searchId = sc.nextInt();
		boolean notFound = true;
		for(int i=0; i<products.length; i++)
		{
			if(searchId==products[i].getId())
			{
				notFound= false;
				IO.println("Product Found: "+products[i]);
			}
		}
		if(notFound) IO.println("Product with ID "+searchId+" not found.");
		sc.close();
	}

}
