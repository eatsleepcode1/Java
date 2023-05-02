/*A user will enter an initial number, followed by that number of integers. Output those integers' sum. 
Repeat until the initial number is 0 or negative. Ex: If the user enters 3 9 6 1 0, the output is:
16
Ex: If the user enters 3 9 6 1 2 5 3 0, the output is:
16
8
Hints:
    Use a while loop as an outer loop. Get the user's initial number of ints before the loop, and at the end of the loop body.
    Use a for loop as an inner loop, inside the while loop body. Loop from i = 0, to i < (the number of ints).
    In the for loop, first read the next integer, then update the sum. After the for loop, output the sum.*/
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numInts = 0;
      int intsSum = 0;
      int userInt = 0;
      int i;
      
      numInts = scnr.nextInt();
      
      while (numInts > 0) {
         
         intsSum = 0;
         for (i = 0; i < numInts; ++i) {
            userInt = scnr.nextInt();
            intsSum += userInt;
         }
         System.out.println(intsSum);
         
         numInts = scnr.nextInt();
      }
   }
}

/* NOTES

* Think of the outer loop separately from the inner loop. The outer loop uses "while" because the number of iterations 
  is unknown. The inner loop uses "for" because the number of iterations is known to be numInts. 
  
* A common error is to forget to get user input at the end of the while loop's body, yielding an infinite loop.

*/
