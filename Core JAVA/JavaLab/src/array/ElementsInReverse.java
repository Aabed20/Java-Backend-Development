package array;

public class ElementsInReverse
{
	public static void main(String[] args)
	{
		int size = Integer.parseInt(IO.readln("Enter number of elements you want to store : :"));
		int arr[]=new int[size];
		IO.println("Enter Elements : ");
		for(int i=0; i<size; i++)
		{
			arr[i]=Integer.parseInt(IO.readln());
		}
		IO.println("Reverse of Array is : ");
		for(int i=arr.length-1; i>=0; i--)
		{
			IO.print(arr[i]+" ");
		}

	}

}
