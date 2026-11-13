public class SwapTwoNumber
{
    public static void main(String[] args)
    {
      int a = Integer.parseInt(args[0]); //10
      int b = Integer.parseInt(args[1]); //20
       a = a+b; //30
       b = a-b; //10
       a = a-b; //20
      System.out.println("Swap is "+"a = "+a+"  b = "+b);
     }
}   