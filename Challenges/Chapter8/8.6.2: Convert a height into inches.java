/*Write a second convertToInches() with two double parameters, numFeet and numInches, that returns the total number of inches. 
Ex: convertToInches(4.0, 6.0) returns 54.0 (from 4.0 * 12 + 6.0). */
import java.util.Scanner;

public class MethodOverload {

   public double convertToInches(double numFeet) {
      return numFeet * 12.0;
   }

   /* Your solution goes here  */

   public static void main (String [] args) {
      double totalInches;
      MethodOverload measuringTape = new MethodOverload();

      totalInches = measuringTape.convertToInches(4.0, 6.0);
      System.out.println("4.0, 6.0 yields " + totalInches);

      totalInches = measuringTape.convertToInches(5.9);
      System.out.println("5.9 yields " + totalInches);
   }
}
/* Your solution goes here  */
public static double convertToInches(double numFeet, double numInches){
      return numFeet * 12 + numInches;
      }
