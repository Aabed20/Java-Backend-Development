package com.aabed.abstraction;

public class OrderedCake extends Cake{

	private String message;
	

	public OrderedCake(String shape,String flavour,int quantity) {
		super(shape,flavour,quantity);
	}
	public OrderedCake(String shape,String flavour,int quantity,String message) {
		super(shape,flavour,quantity);
		this.message=message;
	}
	@Override
	public String toString() {
		if(message==null) 
		{
			return super.toString();
		//return "A "+getShape()+" "+getFlavour()+" Cake of "+getQuantity()+" KG is Ready with Happy Birthday message @ Rs."+(getQuantity()*price);
		}
		else 
		{
		return "A "+getShape()+" "+getFlavour()+" Cake of "+getQuantity()+" KG is Ready with "+this.message+" @ Rs."+(getQuantity()*price);
		}
	}	
}
