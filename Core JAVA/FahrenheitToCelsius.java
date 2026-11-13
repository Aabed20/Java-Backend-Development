public class FahrenheitToCelsius
{
    public static void main(String[] args)
    {
      int fahrenheit = Integer.parseInt(args[0]);
      int celsius = ((fahrenheit-32)*5)/9;
      System.out.println("Fahrenheit to Celcius will be : "+celsius);
    }
}
