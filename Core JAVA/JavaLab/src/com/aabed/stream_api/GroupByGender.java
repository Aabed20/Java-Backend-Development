package com.aabed.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Person1(String name, Integer age, String gender) {}


public class GroupByGender
{
	public static void main(String[] args)
	{
		ArrayList<Person1> list = new ArrayList<>();
		list.add(new Person1("Aabed",21,"Male"));
		list.add(new Person1("Bob",30,"Male"));
		list.add(new Person1("Smith",32,"Male"));
		list.add(new Person1("Bushra",19,"Female"));
		list.add(new Person1("Alice",25,"Female"));
		list.add(new Person1("Saniya",22,"Female"));
		
		Map<String, List<Person1>> collect = list.stream() 
		  .collect(Collectors.groupingBy(person-> person.gender()))
		   ;
		
		IO.println("Male : \n");
		collect.forEach((k,v) -> {
			if(k.equals("Male"))
			{
				v.forEach(IO::println);
			}
		}
		);
		IO.println("\n\nFemale : \n");
		collect.forEach((k,v) -> {
			if(k.equals("Female"))
			{
				v.forEach(IO::println);
			}
		}
		);
	}

}
