package com.aabed.stream_api;

import java.util.ArrayList;
import java.util.List;

record Person(String name,Integer age) {}

public class AgeSortInAscending 
{
	public static void main(String[] args) 
	{
		ArrayList<Person> list = new ArrayList<>();
		
		list.add(new Person("Aabed",21));
		list.add(new Person("Altamash",20));
		list.add(new Person("Asif",22));
		list.add(new Person("zaid",19));
		
		List<Person> list2=list.stream()
		  .sorted((p1,p2)->Integer.compare(p1.age(), p2.age()))
		    .toList();
		
		IO.println(list2);

	}

}

