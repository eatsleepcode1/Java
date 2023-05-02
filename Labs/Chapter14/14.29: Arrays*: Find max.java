/*Traversing an array to find the max (or min) is common. Given an array of integers, output the maximum integer found in the array. 
If the input is 4 3 8 2 6, the output is 8.
Hints:
    Declare a variable named maxItem to hold the max value seen so far. Update that value if you ever see a larger value.
    Initialize that variable to any element's value, NOT to 0.*/
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numItems;
      int currItem;
      int i;
      int maxItem;
      
      // Get items
      numItems = scnr.nextInt();
      
      int[] listItems = new int[numItems];
      
      for (i = 0; i < numItems; ++i) {
         currItem = scnr.nextInt();
         listItems[i] = currItem;
      }
      
      maxItem = listItems[0]; // Initializing to value 0 would be WRONG. Can initialize to any arbitrary element's value.
      for (i = 0; i < numItems; ++i) {
         if (listItems[i] > maxItem) {
            maxItem = listItems[i]; // This item is max seen so far, so update the max
         }
      }
      
      System.out.println(maxItem);
   }
}

/* NOTES

* Initializing maxItem to 0 would be WRONG. The test case with negative numbers would incorrectly output 0. maxItem can
  instead be initialized to any arbitrary element's value. Some programmers might instead initialize maxItem to the smallest
  possible value on the system (the smallest possible negative value), but that approach is unnecessarily complex. 
  
* The pattern of traversing an array and keeping track of the max or min value is a common pattern. 

*/ 
