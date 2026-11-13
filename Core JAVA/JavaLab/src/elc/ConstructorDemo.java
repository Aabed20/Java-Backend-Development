package elc;

import java.util.Scanner;

import blc.Car;

public class ConstructorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Car Model :");
		String model = sc.nextLine();
		System.out.println("Enter Car Manufacturing year :");
		int year = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Car Price :");
		double price = Double.parseDouble(sc.nextLine());
		sc.close();
		Car c1 = new Car(model, year, price);
		System.out.println(c1.toString());

	}

}
