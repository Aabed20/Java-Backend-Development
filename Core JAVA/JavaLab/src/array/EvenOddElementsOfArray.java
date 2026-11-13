package array;

import java.util.Scanner;

public class EvenOddElementsOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int arraySize = Integer.parseInt(sc.nextLine());
		
		int arr[] = new int[arraySize];
		System.out.println("Enter values of array : ");
		
		for(int i=0; i<arraySize; i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println("Even numbers : ");
		for(int j=0; j<arraySize; j++) {
			if(arr[j]%2==0) {
			System.out.print(arr[j]+" ");
			}
			
		}
		System.out.println("              ");
		System.out.println("Odd numbers :");
		for(int j=0; j<arraySize; j++) {
			if(arr[j]%2==1) {
			System.out.print(arr[j]+" ");
			}
			
		}
		sc.close();
          
	}

}
