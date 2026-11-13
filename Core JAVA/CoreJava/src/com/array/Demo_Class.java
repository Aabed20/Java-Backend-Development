package com.array;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demo_Class
{
	public static void main(String[] args) 
	{
		
		 
		 try
		 {
			 Class<Demo> cls = Demo.class;
				
			 Constructor<Demo> cons = cls.getDeclaredConstructor();
			cons.setAccessible(true);
			 
			Demo d = cons.newInstance();
			
			Field name = cls.getDeclaredField("name");
			
		    name.setAccessible(true);
		    name.set(d, "Aabed Khan");
         
		    IO.print(name.get(d));
		    
		} 
		 catch (Exception e)
		 {	
			e.printStackTrace();
		 }
		
            		
		
	}

}
