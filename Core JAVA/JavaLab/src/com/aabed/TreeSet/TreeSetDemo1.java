 package com.aabed.TreeSet;

import java.util.TreeSet;

record Product(Integer pid,String pname)
 {
	 Product{
	 if(pid<0)
	 {
		 throw new IllegalArgumentException();
	 }
	 }
 }
 
public class TreeSetDemo1 
{
	public static void main(String[] args) 
	{
		try {
		TreeSet<Product> listOfProducts1 = new TreeSet<>((p1,p2)->p1.pid().compareTo(p2.pid()));
         listOfProducts1.add(new Product(100,"Laptop")); 
         listOfProducts1.add(new Product(90,"Mobile")); 
         listOfProducts1.add(new Product(110,"Tv")); 
         listOfProducts1.add(new Product(10,"Bag"));
         
         IO.println("Sorting Based on Product id in Ascending order :\n"+listOfProducts1+"\n");
	
         TreeSet<Product> listOfProducts2 = new TreeSet<>((p1,p2)->p2.pid().compareTo(p1.pid()));
         listOfProducts2.add(new Product(100,"Laptop")); 
         listOfProducts2.add(new Product(90,"Mobile")); 
         listOfProducts2.add(new Product(110,"Tv")); 
         listOfProducts2.add(new Product(10,"Bag"));
         
         IO.println("Sorting Based on Product id in Descending order :\n"+listOfProducts2+"\n");
         
         TreeSet<Product> listOfProducts3 = new TreeSet<>((p1,p2)->p1.pname().compareTo(p2.pname()));
         listOfProducts3.add(new Product(100,"Laptop")); 
         listOfProducts3.add(new Product(90,"Mobile")); 
         listOfProducts3.add(new Product(110,"Tv")); 
         listOfProducts3.add(new Product(10,"Bag"));
         
         IO.println("Sorting Based on Product Name in Alphabetical order :\n"+listOfProducts3+"\n");
	     
         TreeSet<Product> listOfProducts4 = new TreeSet<>((p1,p2)->p2.pname().compareTo(p1.pname()));
         listOfProducts4.add(new Product(-100,"Laptop")); 
         listOfProducts4.add(new Product(90,"Mobile")); 
         listOfProducts4.add(new Product(110,"Tv")); 
         listOfProducts4.add(new Product(10,"Bag"));
         
         IO.println("Sorting Based on Product Name in Reverse order :\n"+listOfProducts4+"\n");
		}
		catch(Exception e)
		{
			IO.println("Id cannot be negative");
			e.printStackTrace();
		}
	}

}
