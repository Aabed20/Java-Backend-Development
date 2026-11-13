package com.aabed.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class ArrayToList
{
	public static List<String> converToList(String[] inputsArray)
	{
		ArrayList<String> listOfStrings = new ArrayList<>();
		for(int i=0; i<inputsArray.length; i++)
		{
			listOfStrings.add(inputsArray[i]);
		}
		listOfStrings.trimToSize();
		return listOfStrings;
	}
}

public class ArrayToListTester 
{	
	public static void main(String[] args) 
	{
		String str[] = new String[3];
		str[0] = "Aabed";
		str[1] = "Pathan";
		str[2] = "Asef";
		ArrayList<String> list=(ArrayList<String>)ArrayToList.converToList(str);
         IO.println(list);
        IO.println(list.size());
        
	}
}
