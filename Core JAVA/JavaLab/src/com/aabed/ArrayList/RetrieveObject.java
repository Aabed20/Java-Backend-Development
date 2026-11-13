package com.aabed.ArrayList;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class RetrieveObject 
{
	public static void main(String[] args) 
	{
		try
		{
			String path = "C:\\student\\students.txt";
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			 @SuppressWarnings("unchecked")
			 ArrayList<Student> list =
		                (ArrayList<Student>) ois.readObject();

		            for (Student s : list) 
		            {
		                System.out.println(s);
		            }
		    fis.close();
			ois.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
