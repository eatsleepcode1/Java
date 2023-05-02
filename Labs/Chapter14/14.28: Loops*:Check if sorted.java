/*Given a list of unique numbers, write a program that outputs Sorted if the numbers are in ascending order, Unsorted otherwise. 
The first number input indicates how many numbers are in the subsequent list. If the input is 5 1 3 6 7 9, output Sorted. 
If the input is 3 10 8 2, output: Unsorted. A list of size 0 or 1 is sorted.
Hints:
    Remember that only one violation makes the entire list unsorted.
    For simplicity, you don't have to don't break out of the loop if you find two numbers aren't ascending. 
    Instead, use a bool variable, initialize it to true, and set it to false if you find any violation.*/
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int listSize;
      int currNum = 0, prevNum = 0;
      boolean isSorted;
      int i;

      listSize = scnr.nextInt();
      
      isSorted = true; // Assume sorted, until find a violation
      for (i = 0; i < listSize; ++i) {
         prevNum = currNum;
         currNum = scnr.nextInt();
         if (i > 0) { // Only check for ascending if this isn't the first item
            if (!(currNum > prevNum)) { // Check is ascending property is not violated
               isSorted = false; // All it takes is one violation for the entire list to not be sorted
            }
         }
      }
      
      if (isSorted) {
         System.out.println("Sorted");
      }
      else {
         System.out.println("Unsorted");
      }

   }
}


/* NOTES
  
* The expression !(currNum > prevNum) was used instead of the equivalent expression (currNum <= prevNum), because we
  felt it more directly matched the intuitive logic: If the numbers are NOT ascending, the list isn't sorted. 
  
* A common error is to use an if-else in the loop, setting isSorted with false if the current pair is not ascending, 
  and with true otherwise. That setting with true is wrong. We are looking for a single violation; if one occurs, 
  the entire list is not sorted, so the variable should stay false, no matter what is seen later.  

*/ 
