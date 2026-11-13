package com.aabed.abstraction;

import java.util.Scanner;

public class CakeOrder {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Which Shape cake you want : ");
		String shape = sc.nextLine();
		System.out.print("Enter the cake flavour you want : ");
		String flavour = sc.nextLine();
		System.out.print("Enter the quantity of cake in KG : ");
		int quantity = Integer.parseInt(sc.nextLine());
		System.out.print("Do you want to write message on cake [yes/no] : ");
		String choice = sc.nextLine();
		Cake cake ;
		if(choice.equalsIgnoreCase("yes"))
		{
			System.out.print(" Enter what message you want to write on Cake : ");
			String message = sc.nextLine();
			
			cake=new OrderedCake(shape,flavour,quantity,message);
			System.out.println(cake);
		}
		else 
		{
		cake = new OrderedCake(shape,flavour,quantity);
		System.out.println(cake);
		}
	}

}
