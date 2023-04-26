Level 1
/*Double variable numSeconds is read from input. Type cast numSeconds to an integer.
Ex: If the input is 0.5, then the output is:
0*/

import java.util.Scanner;

public class IntegerNumberConverter {
   public static void main(String args[]) {
      Scanner scnr = new Scanner(System.in);
      double numSeconds;
   
      numSeconds = scnr.nextDouble();
      
      System.out.println(/* Your code goes here */);
   }
}
/* Your code goes here */ = (int)(numSeconds));

Level 2
/*Given that 1 kilometer = 1000 meters, complete the calculation to convert the integer variable numKilometers to the double variable numMeters 
using implicit conversion.
Ex: If the input is 25, then the output is:
25000.0 meters */
import java.util.Scanner;

public class MetersConverter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int METERS_PER_KILOMETER = 1000;
      int numKilometers;
      double numMeters;
   
      numKilometers = scnr.nextInt();
   
      numMeters = /* Your code goes here */ METERS_PER_KILOMETER;
   
      System.out.print(numMeters);
      System.out.println(" meters");
   }
}
/* Your code goes here */ = numMeters = (double)(numKilometers)* METERS_PER_KILOMETER;

Level 3
/*Integers napTime1, napTime2, and kidsCount are read from input. 
Compute the average nap time of each kid using floating-point division, and assign the result to avgTime.
Ex: If the input is 14 4 2, then the output is:
9.0 */
 public class SleepStatistics {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int napTime1;
		int napTime2;
      int kidsCount;
      double avgTime;

      napTime1 = scnr.nextInt();
		napTime2 = scnr.nextInt();
      kidsCount = scnr.nextInt();
   
      /* Your code goes here */
     avgTime = (double)(napTime1 + napTime2) / (double)(kidsCount);

      System.out.println(avgTime);
   }
} 


