package aabed;

import java.util.Scanner;

public class GetTwoDigitsDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a =sc.nextInt();
		System.out.println(TwoDigitsDifference.getDiffOfDigits(a));
		sc.close();

	}

}
