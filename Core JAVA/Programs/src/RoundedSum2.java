package aabed;

import java.util.Scanner;

public class RoundedSum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = RoundedSum.sumOfRoundedValues(a)+RoundedSum.sumOfRoundedValues(b)+RoundedSum.sumOfRoundedValues(c);
		System.out.println("Sum is "+sum);
        sc.close();
	}

}
