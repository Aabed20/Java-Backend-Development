package array;

import java.util.Scanner;

public class AdditionOfFirstAndLastArrayElement {

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
		int add = arr[0]+arr[arraySize-1];
        System.out.print(add);
	    sc.close();
	}

}
