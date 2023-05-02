/*Write a program that outputs the biggest difference (absolute value) between any successive pair of numbers in a list. 
Such a list might represent daily stock market prices or daily temperatures, so the difference represents the biggest single-day change. 
The input is the list size, followed by the numbers. If the input is 5 60 63 68 61 59, the output is 7.
Hints:
    Declare a variable for the current number, and another for the previous number. At the start of each loop iteration, set prevNum = currNum, 
    then get the next number into currNum.
    Maintain a max difference variable. Initialize it with 0. In each loop iteration, check if the difference between currNum 
    and prevNum exceeds maxDiff; if so, update maxDiff with that difference.
    Don't forget to take the absolute value of the difference before the above comparison.
    Don't try to check the max difference for the first number in the list, since no previous number exists. */
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int listSize;
      int currNum = 0;
      int prevNum;
      int currDiff, maxDiff;
      int i;
      
      listSize = scnr.nextInt();
      
      maxDiff = 0;
      for (i = 0; i < listSize; ++i) {
         prevNum = currNum;
         currNum = scnr.nextInt();
         if (i > 0) { // Only do for 2nd num and above; first num lacks previous num so no difference to calculate
            currDiff = currNum - prevNum;
            if (currDiff < 0) { // Absolute value
               currDiff = -currDiff;
            }
            if (currDiff > maxDiff) { // Largest diff seen so far
               maxDiff = currDiff;
            }
         }
      }
      
      System.out.println(maxDiff);
   
   }
}

/* NOTES

* Keeping track of a previous value in a loop, *except* for the first item, is a common pattern.

* Keeping track of a max (or min) value while iterating through a loop is a common pattern.

* Absolute value could have been computed using the integer Math.abs() function.

*/ 
