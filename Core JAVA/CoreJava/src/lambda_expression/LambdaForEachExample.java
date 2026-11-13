package lambda_expression;

import java.util.Arrays;
import java.util.List;

public class LambdaForEachExample {

	public static void main(String[] args)
	{
	  List<String> words = Arrays.asList("apple","banna","cherry");
	  
	  words.forEach(word -> System.out.println(word));
		
	}

}
