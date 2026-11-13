package array;

import java.util.Scanner;

public class PrintMiddleElement {

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
		if(arraySize%2!=0) {
			System.out.println("Middle element of array is : "+arr[(arraySize/2)]);
		}
		else {
			System.out.println("Middle element of array is : "+arr[(arraySize/2)-1]+" "+arr[(arraySize/2)]);

		}
     sc.close();
	}

}
