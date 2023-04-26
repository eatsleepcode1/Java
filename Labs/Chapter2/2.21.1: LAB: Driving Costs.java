/* Driving is expensive. Write a program with a car's gas mileage (miles/gallon) and the cost of gas (dollars/gallon) as floating-point input, 
and output the gas cost for 20 miles, 75 miles, and 500 miles.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f", yourValue);

The output ends with a newline.

Ex: If the input is:

20.0 3.1599

where the gas mileage is 20.0 miles/gallon and the cost of gas is $3.1599/gallon, the output is:

3.16 11.85 79.00

Note: Real per-mile cost would also include maintenance and depreciation. **/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      double milesPerGallon;
      double dollarsPerGallon;
      double totalCost;
      
      milesPerGallon = scnr.nextDouble();
      dollarsPerGallon = scnr.nextDouble();
      
      totalCost = dollarsPerGallon / milesPerGallon;
      
      System.out.printf("%.2f ", totalCost * 20.0);
      System.out.printf("%.2f ", totalCost * 75.0 );
      System.out.printf("%.2f\n", totalCost * 500.0);
   }
}
