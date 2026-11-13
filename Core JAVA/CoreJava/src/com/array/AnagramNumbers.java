package com.array;
import java.util.*;

public class AnagramNumbers 
{
	    public static void main(String[] args) 
	    {
	       Scanner sc = new Scanner(System.in);
	       int element1 = sc.nextInt();
	       int element2 = sc.nextInt();
	       int e1 = element1;
	       int e2 = element2;

	       int []freq1 = new int[9];
	       int []freq2 = new int[9];

	       while(e1>0)
	       {
	           freq1[e1%10]++;
	          e1 = e1/10;

	       }
	        while(e2>0)
	       {
	          freq2[e2%10]++;
	          e2 = e2/10;
	       }
	     boolean isAnagram = true;
	       for(int i=0; i<freq1.length; i++)
	       {
	        if(freq1[i]!=freq2[i])
	        { 
	            isAnagram = false;
	            break;
	        }
	       }
	       if(isAnagram)
	       {
	        IO.println("Both are Anagram numbers");
	       }
	       else
	       {
	        IO.println("Not a Anagram");
	       }
         sc.close();
	    }

	}    







