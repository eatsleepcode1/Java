/*Given sphereRadius, compute the volume of a sphere and assign sphereVolume with the result. Use (4.0 / 3.0) to perform floating-point division, 
instead of (4 / 3) which performs integer division.

Volume of sphere = (4.0 / 3.0) π r3 (Hint: r3 can be computed using *. Use the constant Math.PI for the value of pi.)   **/

import java.util.Scanner;

public class SphereVolumeCalculator {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double sphereVolume;
      double sphereRadius;

      sphereRadius = scnr.nextDouble();

      /* Your solution goes here  */

      System.out.printf("%.2f\n", sphereVolume);
   }
}
Solution: 
sphereVolume = (4.0 / 3.0) * Math.PI * (sphereRadius * sphereRadius * sphereRadius);
System.out.printf("%.4f\n", Math.PI);
