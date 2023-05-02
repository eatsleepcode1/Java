/*A binary number's digits are only 0's and 1's, with each digit's weight being an increasing power of 2. 
Ex: 110 is 1*22 + 1*21 + 0*20 = 1*4 + 1*2 + 0*1 = 4 + 2 + 0 = 6. A user enters an 8-bit binary number as 1's and 0's separated by spaces. 
Then compute and output the decimal equivalent. Ex: For input 0 0 0 1 1 1 1 1, the output is:
31
(16 + 8 + 4 + 2 + 1)
Hints:
    Store the bits in reverse, so that the rightmost bit is in element 0.
    Write a for loop to read the input bits into an array. Then write a second for loop to compute the decimal equivalent.
    To compute the decimal equivalent, loop through the elements, multiplying each by a weight, and adding to a sum.
    Use a variable to hold the weight. Start the weight at 1, and then multiply the weight by 2 at the end of each iteration. */
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int[] binaryNum = new int[8];
      int digitWeight; 
      int decimalSum; 
      int i;
      
      // Get user's binary number. Store leftmost bit in element 7, rightmost in 0. 
      for (i = 7; i >= 0; --i) {
         binaryNum[i] = scnr.nextInt(); 
      }
      
      // Compute decimal equivalent
      decimalSum = 0; 
      digitWeight = 1; // Rightmost digit's weight, 2^0
      for (i = 0; i < 8; ++i) {
         decimalSum += binaryNum[i] * digitWeight;
         digitWeight *= 2; 
      }
      
      System.out.println(decimalSum);
   }
}
