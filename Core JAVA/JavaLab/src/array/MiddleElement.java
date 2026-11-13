package array;

public class MiddleElement
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
		if(arr.length%2==1)
		{
		IO.println("Middle Element is : "+arr[arr.length/2]);
		}
		else
		{
			IO.println("Middle Element is : "+arr[arr.length/2-1]+" "+arr[arr.length/2]);
		}

	}

}
