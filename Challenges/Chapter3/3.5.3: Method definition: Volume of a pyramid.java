/*Define a method pyramidVolume with double parameters baseLength, baseWidth, and pyramidHeight, that returns as a double the volume of a 
pyramid with a rectangular base. Relevant geometry equations:
Volume = base area x height x 1/3
Base area = base length x base width.
(Watch out for integer division). */

import java.util.Scanner;

public class CalcPyramidVolume {

   /* Your solution goes here  */

   public static void main (String [] args) {
      CalcPyramidVolume volumeCalculator = new CalcPyramidVolume();
      System.out.println("Volume for 1.0, 1.0, 1.0 is: " + volumeCalculator.pyramidVolume(1.0, 1.0, 1.0));
   }
}
/* Your solution goes here  */
public double pyramidVolume(double baseLength, double baseWidth, double pyramidHeight){
      double baseArea = (baseLength * baseWidth);
      double volume = (baseArea * pyramidHeight * (0.333333333333));
      
      return volume;
      }
