package com.aabed.stream_api;

import java.util.ArrayList;
import java.util.List;

public class FlatteningListOfintegers
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(4);
        list3.add(5);
        list3.add(6);
        list3.add(7);
        
       ArrayList<List<Integer>> listOflist = new ArrayList<>();
       
       listOflist.add(list);
       listOflist.add(list2);
       listOflist.add(list3);
       
       List<Integer> list5 = listOflist.stream()
          .flatMap((list4)-> list4.stream())
           .distinct()
           .toList();
       
       IO.println("Flattened List Without Duplicates: ");
       list5.forEach(IO::println);
        		 
	}

}
