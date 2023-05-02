/*A publisher may allow a reader to select a subset of chapters to purchase. Given 15 integers that are 0 or 1 indicating whether or not to include 
chapters 1 to 15, output the selection using shorthand for ranges of 3 or more (11, 12, 13 becomes 11-13). If the input is 1 1 1 1 0 1 0 1 1 0 1 1 1 0 0, 
the output should be: 1-4 6 8 9 11-13. If no chapters are selected, output: None. For simplicity, follow every term including the last by one space 
(and end with newline).
Hints:
    This problem is hard. Start by creating a for loop that just prints the selected chapters one by one, without shorthands for ranges. 
    Your program will pass a few test cases.
    Next, extend the loop body to handle the case for a range of 3. Use an if statement to lookahead from index i to i+1 and i+2. 
    If all three elements are 1's, print the range. Be careful to only do the lookahead if the current i is 13 or less. If the current index is 14 (or 15), 
    there's no need to lookahead; the range can't be 3 or more because only 15 chapters exist.
    If your loop body printed a range like 2-4, don't forget to update your loop's index i to be 4 (don't leave it at 2).
    One you get the above working, then use a nested while loop to detect even larger ranges, such as 2-7. And don't forget to update the 
    for loop index i to the detected range end.
    Use a boolean variable, initialized to false, and in your for loop set it to true if any chapter is selected. After your for loop above, 
    if the variable is still false, print "None ". */
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      boolean[] chptList = new boolean[16]; // Valid chapters are 1-15. 1 means include, 0 exclude. Element 0 unused. 
      int includeChpt;
      boolean atLeastOne = false;
      int i, j;
      
      // Get the chapter selections
      for (i = 1; i <= 15; ++i) {
         includeChpt = scnr.nextInt(); 
         if (includeChpt==1) {
            chptList[i] = true;
         }
         else {
            chptList[i] = false;
         }
      }
      
      // Output the chapter selections, using ranges like 2-4 for ranges of 3-or-more
      for (i = 1; i <= 15; ++i) {  // Note: Loop body may advance i
         if (chptList[i]) { // Output this number
            System.out.print(i); // Output this number, followed either by "-X " for a range that goes to X, else just " ". 
            atLeastOne = true;
            if ( (i <= 13) &&  // Possible 3-or-more range
                 (chptList[i + 1] && chptList[i + 2] )) { // 3-or-more range found. Note: Short-circuit evaluation important
               // Find end of range
               j = i + 2; // Last 1 seen so far in the range
               while ( (j <= 14) && (chptList[j + 1]) ) { // Range continues...  Note: Short-circuit evaluation important
                  j += 1; // ...so extend the range
               }
               System.out.print("-" + j + " ");
               i = j; // Set i to end of range, so next for loop iteration will start at the next number
            }
            else {
               System.out.print(" "); // No 3-or-more range, so just output a space after the number
            } 
         }
      }
      if (!atLeastOne) { // No chapters were selected
         System.out.print("None ");
      }
      System.out.println();
   }
}
