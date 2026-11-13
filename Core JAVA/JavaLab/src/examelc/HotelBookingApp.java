package examelc;

import java.util.Scanner;

import examblc.Hotel;

public class HotelBookingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name");
		String customerName = sc.nextLine();
		System.out.println("Enter Hotel Name:");
		String hotelName = sc.nextLine();
		System.out.println("Enter Room Rate per Day:");
		double roomRent = Double.parseDouble(sc.nextLine());
		System.out.println("Enter Number of DaysStayed :");
		int days = Integer.parseInt(sc.nextLine());
        sc.close();
        System.out.println("------ HOTEL BOOKING SUMMARY ------");
        System.out.println("Customer Name  : "+customerName);
        System.out.println("Hotel Name  : "+hotelName);
        System.out.println("Room Rate (per day) : "+roomRent);
        System.out.println("Days Stayed  : "+days);
        System.out.println("Total Amount  : "+Hotel.calculateTotalAmount(roomRent, days));
        System.out.println("Amount after Discount   : "+Hotel.calculateDiscountedAmount(days, Hotel.calculateTotalAmount(roomRent, days)));
		
	}

}
