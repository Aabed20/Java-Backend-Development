package com.aabed.equals_method;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Hello 
{
	public static void main(String[] args)
	{
		Iterator iterator = null;
       ListIterator e = null;
       Vector<String> listOfCity = new Vector<>();
       listOfCity.add("hyd");
       listOfCity.add("pune");
       listOfCity.add("Indore");
       listOfCity.add("degloor");
       listOfCity.ensureCapacity(20);
       listOfCity.remove(0);
       IO.println(listOfCity.capacity());
       listOfCity.trimToSize();
       IO.println(listOfCity.capacity());
       Collection collection = null;
      
	}

}
