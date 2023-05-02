/*(1) Given an integer n, write a for loop that outputs the numbers from -n to +n. Assume n is nonnegative. End the sequence with a newline.\
Enter an integer:
2
Sequence: -2 -1 0 1 2
(2) If n is negative, treat as the absolute value. So n of -2 is the same as n of 2. Hint: Use an if statement before the for loop, 
to compute the absolute value of n.
Enter an integer:
-2
Sequence: -2 -1 0 1 2*/
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int n;
      int i;
   
      System.out.println("Enter an integer:");
      n = scnr.nextInt();
   
      System.out.print("Sequence: ");
      /* Type your code here. */
      if (n < 0) {
         n = -n; 
      }
      for (i = -n; i <= n; ++i) {
         System.out.print(i + " ");
      }
      System.out.println();

   }
}
