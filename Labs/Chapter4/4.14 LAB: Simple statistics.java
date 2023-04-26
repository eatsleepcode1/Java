/*Part 1

Given 4 integers, output their product and their average using integer arithmetic.
Ex: If the input is:
8 10 5 4

the output is:
1600 6

Note: Integer division discards the fraction. Hence the average of 8 10 5 4 is output as 6, not 6.75.
Note: The test cases include four very large input values whose product results in overflow. 
You do not need to do anything special, but just observe that the output does not represent the correct product 
(in fact, four positive numbers yield a negative output; wow).
Submit the above for grading. Your program will fail the last test cases (which is expected), until you complete part 2 below.
Part 2
Also output the product and average using floating-point arithmetic.
Output each floating-point value with three digits after the decimal point, which can be achieved as follows:
System.out.printf("%.3f", yourValue);
Hint: Convert the input values from int to double.
Ex: If the input is 8 10 5 4, the output is:
1600 6
1600.000 6.750
Note that fractions aren't discarded, and that overflow does not occur for the test case with large values.*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      int num3;
      int num4;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      num3 = scnr.nextInt();
      num4 = scnr.nextInt();
      int average;
      average = (num1 * num2 * num3 * num4);
      int product;
      product = (num1 + num2 + num3 + num4) / 4;
      double product2;
      double average2;
      average2 = ((double)num1 + num2 + num3 + num4);
      product2 = ((double)num1 * num2 * num3 * num4);
      
      System.out.printf("%d %d\n", average, product);
      System.out.printf("%.3f %.3f\n", product2, average2 / 4.0 );
   }
}
