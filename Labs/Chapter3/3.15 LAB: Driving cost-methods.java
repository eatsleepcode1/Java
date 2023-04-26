/*Write a method drivingCost() with input parameters milesPerGallon, dollarsPerGallon, and milesDriven that returns the dollar cost to drive those miles. All items are of type double. The method called with arguments (20.0, 3.1599, 50.0) returns 7.89975.

Define that method in a program whose inputs are the car's miles per gallon and the price of gas in dollars per gallon (both doubles). Output the gas cost for 10 miles, 50 miles, and 400 miles, by calling your drivingCost() method three times.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f", yourValue);

The output ends with a newline.

Ex: If the input is:

20.0 3.1599

the output is:

1.58 7.90 63.20

Your program must define and call a method:
public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven)*/

import java.util.Scanner;

public class LabProgram {
   
   /* Define your method here */
   public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven){
      double drivingCost = (milesDriven / milesPerGallon) * dollarsPerGallon;
      return drivingCost;
      }
   
   public static void main(String[] args) {
      /* Type your code here. */
   Scanner scnr = new Scanner(System.in);
   
   Double milesPerGallon = 0.0;
   Double dollarsPerGallon = 0.0;
   Double gasCost = 0.0;
   Double gasCost10 = 0.0;
   Double gasCost50 = 0.0;
   Double gasCost400 = 0.0;
   
   milesPerGallon = scnr.nextDouble();
   dollarsPerGallon = scnr.nextDouble();
   gasCost = dollarsPerGallon / milesPerGallon;
   
   gasCost10 = gasCost * 10;
   System.out.printf("%.2f", gasCost10);
   System.out.print(" ");
   gasCost50 = gasCost * 50;
   System.out.printf("%.2f", gasCost50);
   System.out.printf(" ");
   gasCost400 = gasCost * 400;
   System.out.printf("%.2f%n", gasCost400);
   
   }
}
