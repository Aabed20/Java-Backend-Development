package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStringSeparatedByComma
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Aabed","Rahil","asef","tejas");
		
		String s = list.stream()
		  .collect(Collectors.joining(", "));
       IO.print(s);
	}

}
