/*Given three floating-point numbers x, y, and z, 
output x to the power of z, x to the power of (y to the power of z), the absolute value of y, and the square root of (xy to the power of z).

Ex: If the input is:

3.6 4.5 2.0

the output is:

12.96 1.841304610218211E11 4.5 16.2*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double x;
      double y;
      double z;
      
      x = scnr.nextDouble();
      y = scnr.nextDouble();
      z = scnr.nextDouble();
     System.out.print(Math.pow(x, z));
     System.out.print(" " + Math.pow(x, Math.pow(y, z)));
     System.out.print(" " + Math.abs(y));
     System.out.println(" " + Math.sqrt(Math.pow(x * y, z)));
   }
}
