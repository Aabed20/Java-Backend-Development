package array;

public class EvenAndOdd
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
		
		IO.print("Even elements are : ");
		for(int i=0; i<size; i++)
		{
			if(arr[i]%2==0)
			{
				IO.print(arr[i]+" ");
			}
		}
		IO.println("");
		IO.print("Odd elements are : ");
		for(int i=0; i<size; i++)
		{
			if(arr[i]%2==1)
			{
				IO.print(arr[i]+" ");
			}
		}

	}

}
