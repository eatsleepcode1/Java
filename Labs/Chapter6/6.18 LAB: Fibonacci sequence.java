/*The Fibonacci sequence begins with 0 and then 1 follows. All subsequent values are the sum of the previous two, for example: 0, 1, 1, 2, 3, 5, 8, 13. 
Complete the fibonacci() method, which has an index, n, as parameter and returns the nth value in the sequence. Any negative index values should return -1.
Ex: If the input is:
7
the output is:
fibonacci(7) is 13
Note: Use a for loop and DO NOT use recursion.*/
import java.util.Scanner;

public class FibonacciSequence {
   
   public int fibonacci(int n) {
      /* Type your code here. */
      int i;//stores the value of number inputted, 
      int s1 = 0;//s1 is sequence 1 for the fibonacci method
      int s2 = 1;//s2 is sequence 2 for the fibonacci method
      int c = 0; //this will store the sum of the two sequences
      if (n < 0) {
            return -1;
            }
      for (i = 2; i <= n; i++) {//i stores 2 initially because that is the sum of sequence 1 and sequence 2 
            c = s1 + s2;//This is the sum of the two sequences
            s1 = s2;
            s2 = c;
         }
      return c;
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      FibonacciSequence program = new FibonacciSequence();
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + program.fibonacci(startNum));
   }
}
