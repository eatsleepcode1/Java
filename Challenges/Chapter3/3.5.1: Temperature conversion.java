/*Complete the program by writing and calling a method that converts a temperature from Celsius into Fahrenheit.  **/
import java.util.Scanner;

public class CelsiusToFahrenheit {

   // FINISH: Define celsiusToFahrenheit method here

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      CelsiusToFahrenheit tempConverter = new CelsiusToFahrenheit();
      double tempF;
      double tempC;

      System.out.println("Enter temperature in Celsius: ");
      tempC = scnr.nextDouble();

      // use object tempConverter to call the method
      tempF = 0.0;  // FIX ME

      System.out.print("Fahrenheit: ");
      System.out.println(tempF);
   }
}
Solution:
public class CelsiusToFahrenheit {
   public double toCelsius(double tempC){
   double tempF = ((1.8 * tempC) + 32);
   return tempF;
   }
  
  tempF = tempConverter.toCelsius(tempC);
