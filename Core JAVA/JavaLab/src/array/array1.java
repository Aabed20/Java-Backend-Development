package array;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {

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
		
		System.out.print(Arrays.toString(arr));
     sc.close();
	}

}
