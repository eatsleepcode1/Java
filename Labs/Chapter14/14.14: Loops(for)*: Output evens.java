/*(1) Given positive integer n, write a for loop that outputs the even numbers from n down to 0. 
If n is odd, start with the next lower even number. Hint: Use an if statement and the % operator to detect if n is odd, decrementing n if so.
Enter an integer:
7
Sequence: 6 4 2 0
(2) If n is negative, output 0. Hint: Use an if statement to check if n is negative. If so, just set n = 0.
Enter an integer:
-1
Sequence: 0
Note: For simplicity add a space after each output value, including the last value. */
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int n;
      int i;
   
      System.out.println("Enter an integer:");
      n = scnr.nextInt();
   
      System.out.print("Sequence: ");

      if (n < 0) {
         n = 0;
      }
   
      if ((n % 2) == 1) {  // Odd
         n = n - 1;
      }
   
      for (i = n; i >= 0; i = i - 2) {
          System.out.print(i + " ");
      }
      System.out.println();
   
   }
}
