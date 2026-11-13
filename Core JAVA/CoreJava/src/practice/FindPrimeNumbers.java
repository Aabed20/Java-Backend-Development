package practice;

import java.util.Arrays;
import java.util.List;

public class FindPrimeNumbers
{
	public static void main(String[] args)
	{
	    List<Integer> list = Arrays.asList(10,3,4,5,7);
	    
	    list.stream()
	     .filter(n->
	     {
	    		 boolean isPrime = true;
	    		 for(int i=2; i<=n/2;i++)
	    		 {
	    			 if(n%i==0)
	    			 {
	    				 isPrime = false;
	    				 break;
	    			 }
	    		 }
	    			 
	    			 return isPrime;
	    			 }
	      ).forEach(n->IO.println(n));
	     
	
	}

}
