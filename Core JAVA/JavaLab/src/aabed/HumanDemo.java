package aabed;

import java.util.Scanner;

public class HumanDemo
{
	
public static void main(String[] args)
	{	
 Human h = new Human();
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter your name ");
 h.name = sc.nextLine();
 System.out.println("Enter your Profession ");
 h.job = sc.nextLine();
 System.out.println("Enter your age");
 h.age = sc.nextInt();
 System.out.println("Enter your height");
 h.height = sc.nextDouble();
 System.out.println("Enter your speed");
 h.speed = sc.nextDouble();
 
 h.getInformationOfHuman();
 h.talk();
 h.run();
 
 sc.close();
}
}