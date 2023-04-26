/*One lap around a standard high-school running track is exactly 0.25 miles. 
Define a method named lapsToMiles that takes a double as a parameter, representing the number of laps, and returns a double that represents the number of miles. Then, write a main program that takes a number of laps as an input, calls method lapsToMiles() to calculate the number of miles, and outputs the number of miles.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f\n", yourValue);

Ex: If the input is:

7.6

the output is:

1.90

Ex: If the input is:

2.2

the output is:

0.55

The program must define and call a method:
public static double lapsToMiles(double userLaps)*/

import java.util.Scanner;

public class LabProgram {
   
   /* Define your method here */ 
   public static double lapsToMiles(double userLaps){
      return userLaps * 0.25;
      }
   
   public static void main(String[] args) {
      /* Type your code here. Your code must call the method.  */
   Scanner scnr = new Scanner(System.in);
      double userLaps;
      
      userLaps = scnr.nextDouble();
     System.out.printf("%.2f\n", lapsToMiles(userLaps));
   }
}
