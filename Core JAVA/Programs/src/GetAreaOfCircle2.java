package aabed;

import java.util.Scanner;

public class GetAreaOfCircle2 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius");
	int a = sc.nextInt();
	System.out.println("Area of circle is "+GetAreaOfCircle.getArea(a));
	sc.close();
}
}
