package examelc;

import java.util.Scanner;

import examblc.Discount;

public class ShoppingCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name");
		String customerName = sc.nextLine();
		System.out.println("Enter Total Bill Amount:");
		double billAmount = Double.parseDouble(sc.nextLine());
        sc.close();
        System.out.println("------ BILL SUMMARY ------");
        System.out.println("Customer Name: "+customerName);
        System.out.println("Original Bill: "+billAmount);
        System.out.println("Amount Payable after Discount: "+Discount.calculateDiscount(billAmount));
		
	}

}
