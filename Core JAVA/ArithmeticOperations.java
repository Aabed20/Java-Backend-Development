public class ArithmeticOperations
{
    public static void main(String[] args)
    {
          int a = Integer.parseInt(args[0]);
          int b = Integer.parseInt(args[1]);
          int sum = a+b;
          int sub = a-b;
          int mul = a*b;
          int div = a/b;
          System.out.println("Addition is : "+sum);
          System.out.println("Subtraction is : "+sub);
          System.out.println("Multiplication is : "+mul);
          System.out.println("Division is : "+div);

    }
}