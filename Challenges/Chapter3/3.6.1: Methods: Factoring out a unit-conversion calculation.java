/*Write a method so that the main() code below can be replaced by simpler code that calls method calcMilesTraveled(). Original main():

public class CalcMiles {
   public static void main(String [] args) {
      double milesPerHour = 70.0;
      double minutesTraveled = 100.0;

      double hoursTraveled;
      double milesTraveled;

      hoursTraveled = minutesTraveled / 60.0;
      milesTraveled = hoursTraveled * milesPerHour;

      System.out.println("Miles: " + milesTraveled);
   }
}*/

import java.util.Scanner;

public class CalcMiles {

   /* Your solution goes here  */

   public static void main(String [] args) {
      double milesPerHour = 70.0;
      double minsTraveled = 100.0;
      CalcMiles tripOdometer = new CalcMiles();

      System.out.println("Miles: " + tripOdometer.calcMilesTraveled(milesPerHour, minsTraveled));
   }
}
/* Your solution goes here  */
   public double calcMilesTraveled(double minutesTraveled, double milesPerHour){
      double hoursTraveled = minutesTraveled / 60.0;
      double milesTraveled = hoursTraveled * milesPerHour;
      return milesTraveled;
      }
