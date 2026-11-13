package com.aabed.collections;
import java.util.*;

public class InsertingElementInTheMiddle
{
	public static void main(String[] args)
	{
		Vector<Integer> integers = new Vector<>();
		
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(5);
		integers.add(6);
		
		IO.println("before Insertion : ");
		for(Integer integer:integers)
		{
			IO.print(integer+" ");
		}
		
		IO.println("\n");
		integers.add(3,4);
		IO.println("After Insertion");
		for(Integer integer:integers)
		{
			IO.print(integer+" ");
		}
		
	}

}
