public class SumAndAverage
{
    public static void main(String[] args)
    {
          int a = Integer.parseInt(args[0]);
          int b = Integer.parseInt(args[1]);
          int c = Integer.parseInt(args[2]);
          double average = (a+b+c)/3;
          System.out.println("Sum is : "+(a+b+c));
          System.out.println("Average is : "+average);

    }
}


