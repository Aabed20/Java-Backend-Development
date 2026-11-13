public class FactorialOfNumber
{
    public static void main(String[] args)
    {
     int num = Integer.parseInt(args[0]);
     int a = 1;
     int factorial = 1;
     while(num!=0)
      { 
        factorial = num*factorial;
        num--;
      }
    System.out.println("Factorial is "+factorial);
   }
}