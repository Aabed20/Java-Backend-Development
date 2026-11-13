package array;

public class ElementFound
{
	public static void main(String[] args)
	{
		int size = Integer.parseInt(IO.readln("Enter Array size : "));
		int []arr = new int[size];
		IO.println("Enter Array elements : ");
		for(int i=0; i<size; i++)
		{
			arr[i]=Integer.parseInt(IO.readln());
		}
		 int searchingElement = Integer.parseInt(IO.readln("Enter searching element : "));
		 int count=0;
		 
		 for(int i=0; i<size; i++)
		 {
			 if(arr[i]==searchingElement)
			 {
				 count++;
				 IO.println("Element found at index "+i);
			 }
		 }
		 if(count==0)
		 {
			 IO.println("Element not found");
		 }
		

	}

}
