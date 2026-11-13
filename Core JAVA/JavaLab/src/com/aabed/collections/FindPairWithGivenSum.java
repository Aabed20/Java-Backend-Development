package com.aabed.collections;

import java.util.Vector;

public class FindPairWithGivenSum
{
	public static void main(String[] args)
	{
	
       Vector<Integer> integers = new Vector<>();
		
		integers.add(2);
		integers.add(7);
		integers.add(4);
		integers.add(8);
		integers.add(3);
		integers.add(5);
		integers.add(1);
		integers.add(6);
		
		int targetNumber = Integer.parseInt(IO.readln("Enter The target Number : "));
		boolean isPair = false;
		
		IO.println("Pairs with sum "+targetNumber+" : ");
		for(int i=0; i<integers.size(); i++)
		{
			for(int j=i+1; j<integers.size(); j++)
			{
			if(integers.get(i)+integers.get(j)==targetNumber)
			{
				IO.println("("+integers.get(i)+", "+integers.get(j)+")");
				isPair=true;
			}
			
			}
		}
		
		if(!isPair)
		{
			IO.println("No Pair found for "+targetNumber);
		}

	}

}
