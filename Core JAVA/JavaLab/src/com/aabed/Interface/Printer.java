package com.aabed.Interface;

@FunctionalInterface
public interface Printer 
{
   public abstract void print();
   
}

class PrinterDemo 
{
	public Printer getPrinter()
	{
		return  new Printer()
		{
           
            @Override
        	public void print() 
            {
        		System.out.println("Print method overriden");
        		
        	}
            
		};
		
	}

	

	

	
	
}
