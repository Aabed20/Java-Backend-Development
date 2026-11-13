package com.aabed.identity_hashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;

record Employee(Integer id, String name)
{}

public class ComparisonOfIdentityHashMapAndHashMap 
{
	public static void main(String[] args)
	{
		HashMap<Employee,String> map = new HashMap<>();
		Employee e1 = new Employee(101,"Aabed");
		Employee e2 = new Employee(102,"Scott");
		Employee e3 = new Employee(101,"Aabed");
		map.put(e1, "Ameerpet");
		map.put(e2, "Banjara Hills");
		map.put(e3, "Yella reddy");
		//HashMap compares keys using hashcode and equals method to findout duplicate keys
		IO.println(map.size());
		IO.println(map);
		IO.println("------------");
		
		IdentityHashMap<Employee,String> identityMap = new IdentityHashMap<>();
		identityMap.put(e1, "Ameerpet");
		identityMap.put(e2, "Banjara Hills");
		identityMap.put(e3, "Yella reddy");
		//IdentityHashMap compares keys using == (memory address) so duplicate object will be added in two different buckets 
		IO.println(identityMap.size());
		IO.println(identityMap);

	}

}
