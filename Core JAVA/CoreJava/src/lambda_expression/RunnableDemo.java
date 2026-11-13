package lambda_expression;

public class RunnableDemo {

	public static void main(String[] args) 
	{
		Runnable rb = () -> 
		{
			for(int i=0; i<5; i++)
			{
				IO.println("Hello ");
			}
		};
		Thread t = new Thread(rb);
		t.start();

	}

}
