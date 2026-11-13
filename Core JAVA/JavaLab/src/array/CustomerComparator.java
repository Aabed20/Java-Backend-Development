package array;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

record Customer(Integer id, String name, Double bill)
{}



public class CustomerComparator
{
	public static void main(String[] args)
	{
		Vector<Customer> customers= new Vector<>();
		
		Scanner sc = new Scanner(System.in);
		
		IO.println("Enter the number of customers : ");
		
		int n =sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++)
		{
			IO.println("Enter id : ");
			int id = sc.nextInt();
			sc.nextLine();
			IO.println("Enter Name : ");
			String name=sc.next();
			IO.println("Enter Bill : ");
			double bill = sc.nextDouble();
			sc.nextLine();
			customers.add(new Customer(id,name,bill));	
		}
		IO.println();
		
		Comparator<Customer> compId= new Comparator<Customer>() {

			@Override
			public int compare(Customer c1, Customer c2) 
			{
				return Integer.compare(c1.id(),c2.id());
			}
			
		};
		IO.println("Sorting based on the id : ");
		Collections.sort(customers, compId);
		for(Customer customer:customers)
		{
			IO.println(customer);
		}
		
		IO.println("\n");
		IO.println("Sorting based on the name : ");
		Comparator<Customer> compName= new Comparator<Customer>() {

			@Override
			public int compare(Customer c1, Customer c2) 
			{
				return c1.name().compareTo(c2.name());
			}
			
		};
		
		Collections.sort(customers, compName);
		for(Customer customer:customers)
		{
			IO.println(customer);
		}
		
		IO.println("\n");
		IO.println("Sorting based on the bill : ");
		Comparator<Customer> compBill= new Comparator<Customer>() {

			@Override
			public int compare(Customer c1, Customer c2) 
			{
				return Double.compare(c1.bill(), c2.bill());
			}
			
		};
		Collections.sort(customers, compBill);
		for(Customer customer:customers)
		{
			IO.println(customer);
		}
		
			sc.close();
		

	}

}
