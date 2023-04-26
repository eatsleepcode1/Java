/*Complete the program by writing and testing the calcMpg() method.  */
import java.util.Scanner;

public class MileageCalc {
   public double convKilometersToMiles(double numKm) {
      double milesPerKm = 0.621371;
      return numKm * milesPerKm;
   }
 
   public double convLitersToGallons(double numLiters) {
     double litersPerGal = 0.264172;
     return numLiters * litersPerGal;
  }
 
   public double calcMpg(double distMiles, double gasGallons) {
      System.out.println("FIXME: Calculate MPG: ");
      return 0.0;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double distKm;
      double distMiles;
      double gasLiters;
      double gasGal;
      double userMpg;
      MileageCalc tripOdometer = new MileageCalc();
   
      System.out.println("Enter kilometers driven: ");
      distKm = scnr.nextDouble();
      System.out.println("Enter liters of gas consumed: ");
      gasLiters = scnr.nextDouble();
   
      distMiles = tripOdometer.convKilometersToMiles(distKm);
      gasGal = tripOdometer.convLitersToGallons(gasLiters);
      userMpg = tripOdometer.calcMpg(distMiles, gasGal);
   
      System.out.println("Miles driven: " + distMiles);
      System.out.println("Gallons of gas: " + gasGal);
      System.out.println("Mileage: " + userMpg + " mpg");
   }
}
Solution:
public double calcMpg(double distMiles, double gasGallons) {
      double calcMpg = distMiles / gasGallons;
      System.out.println("MPG : " + calcMpg);
      return calcMpg;
