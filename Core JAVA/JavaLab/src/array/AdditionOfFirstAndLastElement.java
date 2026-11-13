package array;

public class AdditionOfFirstAndLastElement
{
	public static void main(String[] args)
	{
		int size = Integer.parseInt(IO.readln("Enter number of elements you want to store : "));
		int arr[]=new int[size];
		IO.println("Enter Elements : ");
		for(int i=0; i<size; i++)
		{
			arr[i]=Integer.parseInt(IO.readln());
		}
		IO.println("Addition of first and last Element is : "+(arr[0]+arr[arr.length-1]));

	}

}
