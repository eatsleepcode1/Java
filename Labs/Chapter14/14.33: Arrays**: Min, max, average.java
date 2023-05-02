/*Given 10 input integers, output the minimum, maximum, and average of those integers. If the input is 1 1 1 1 1 3 3 3 3 3, the output is:
1 3 2.0
If the input is 9 8 7 6 5 4 3 2 1 0, the output is:
0 9 4.5
Hints:
    Use a single for loop and update variables minVal, maxVal, and sumVals on each iteration. (You could use three loops instead).
    Initialize variables minVal and maxVal each to the first integer, NOT to 0. 0 is wrong, because integers could be negative. 
    Then update those values if a smaller or larger integer is seen (respectively).
    Don't forget to use floating-point division, not integer division, when computing the average (use / 10.0, not / 10).*/
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int[] userValues = new int[10];
      int i;
      int minVal;
      int maxVal;
      int sumVals;
      int curVal; // Just used for cleaner code below
      
      for (i = 0; i < 10; ++i) {
         userValues[i] = scnr.nextInt();
      }
   
      minVal = userValues[0]; // Smallest seen so far
      maxVal = userValues[0]; // Largest seen so far
      sumVals = 0; 
      for (i = 0; i < 10; ++i) {
         curVal = userValues[i];
   
         if (curVal < minVal) { // Keep track of min
            minVal = curVal;
         }
   
         if (curVal > maxVal) { // Keep track of max
            maxVal = curVal;
         }
         
         sumVals += curVal; // Keep track of sum for computing average later
      }
      
      System.out.println(minVal + " " + maxVal + " " + sumVals / 10.0);

   }
}

/* NOTES

* A common error is initializing minVal to 0. That's wrong, because integers could be negative. 
  When finding the min or max, you can just initialize to the first item, since that's the smallest 
  and largest value seen so far. 
  
* A common error is forgetting to perform floating-point division, instead doing integer division, when computing the 
  average. Here, a floating-point output was required. 
  
* Traversing a vector and computing some features about the elements (min, max, sum, average, etc.) 
  is a common programming task.

*/ 
