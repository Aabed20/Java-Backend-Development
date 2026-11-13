package com.aabed.weak_hashmap;

import java.util.HashMap;
import java.util.WeakHashMap;

record Student(Integer id, String name)
{

	@Override
	public void finalize()
	{
		IO.println("Object destroyed!!!");	}
}

public class WeakHashMapVsHashMap 
{
	public static void main(String[] args)
	{
		HashMap<Student,String> map = new HashMap<>();
		Student s1 = new Student(101,"Aabed");
		Student s2 = new Student(102,"Asif");
		map.put(s1, "Yella Reddy Guda");
		map.put(s2, "Ameerpet");
		
		s1 = null;
		System.gc();
		IO.println(map);
		
		IO.println("-----------------");
		
		WeakHashMap<Student,String> weakMap = new WeakHashMap<>();
		Student s3 = new Student(101,"Aabed");
		Student s4 = new Student(102,"Asif");
		
		weakMap.put(s4, "Ameerpet");
		weakMap.put(s4, "hyd");
		
		s3 = null;
		System.gc();
		
		IO.println(weakMap);
		

	}

}
