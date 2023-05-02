/*The "mode" is a statistical summary of data (as are min, max, and average) representing the most commonly-occurring value. 
Given 10 integers ranging from 0 to 99, output the mode and its frequency. If the input is 1 1 1 1 2 2 9 8 7 6, the output is:
1 4
If any integer is outside 0-99, output an error. If an input is 105, the output is:
Invalid input: 105 is not in 0-99
Hints:
    Knowing that integers are in 0-99 enables creating an array with 100 elements to count the occurrences of each value.
    Traverse the userValues array and keep count by incrementing the appropriate element in a counts array. 
    If the input is 27, then increment element 27's value.
    While traversing userValues, check for an integer outside the range. If found, print the error message, and immediately return.
    After done counting, use another loop to traverse the counts array and find the max. Also keep track of the index where max was found.*/
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int[] userValues = new int[10];
      int i;
      int curVal; // Improves code readability below
      int[] valCounts = new int[100]; 
      int maxCount;
      int maxCountIndex;
      
      for (i = 0; i < 10; ++i) {
         userValues[i] = scnr.nextInt();
      }
   
      // valCounts vector was auto-initialized to all 0's. No need to explicitly initialize here
      for (i = 0; i < 10; ++i) {
         curVal = userValues[i]; 
         if ( (curVal < 0) || (curVal > 99) ) {
            System.out.println("Invalid input: " + curVal + " is not in 0-99");
            return;
         }
         
         ++valCounts[curVal];
      }
      
      maxCount = valCounts[0]; // Max count seen so far  
      maxCountIndex = 0;          // Index of max count seen so far
      for (i = 0; i < 100; ++i) {  // Note to 100, not 10
         if (valCounts[i] > maxCount) {
            maxCount = valCounts[i];
            maxCountIndex = i;
         }
      }
      
      System.out.println(maxCountIndex + " " + maxCount);
   }
}
