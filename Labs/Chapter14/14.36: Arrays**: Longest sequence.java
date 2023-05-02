/*A common statistic of interest is the longest sequence of some pattern in a list of items. 
For example, in football, one may be interested in the longest sequence of consecutive complete passes. 
Given a list in which each item is either the letter "I" (for an incomplete pass) or a number (for a completed pass), 
output the length of the longest sequence of complete passes. The list is preceded by the number of items. Given 8 4 15 9 I 30 2 I 20, 
the output is 3 (because the longest sequence of complete passes is 4 15 9).
Hints:
    Use two variables, one that keeps track of the current sequence length, and another for the longest sequence length.
    In a for loop that iterates through the array, if you see an "I", set the current sequence length to 0.
    Otherwise, you are in sequence (either at the beginning or later in the sequence), so increment the current sequence length.
    A simple way to compute the longest sequence is to potentially update that variable every time you update the current sequence length. 
    Check if the current is greater than the longest -- if so, update the longest.
    When done iterating, just output the value of the longest sequence length variable.*/
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int numItems;
      String currItem;
      int i;
      int currSeqLength, longestSeqLength;
      
      // Get items
      numItems = scnr.nextInt();
      
      String[] listItems = new String[numItems];
      
      for (i = 0; i < numItems; ++i) {
         currItem = scnr.next();
         listItems[i] = currItem;
      }
      
      // Find longest sequence of complete passes
      longestSeqLength = 0;
      currSeqLength = 0;
      for (i = 0; i < numItems; ++i) {
         if (listItems[i].equals("I")) { // Either reached end of sequence, or no sequence yet
            currSeqLength = 0; // Reset for the next sequence
         }
         else { // Either starting a sequence, or in the middle of a sequence
            currSeqLength += 1; 
            if (currSeqLength > longestSeqLength) { // If current sequence is longest seen so far, update longest
               longestSeqLength = currSeqLength; 
            }
         }  
      }
      
      System.out.println(longestSeqLength);
   }
}

/* NOTES

* A common error is to fail to initialize both longestSeqLength and currSeqLength before the loop. 

* Note that if an "I" is seen, only the currSeqLength is re-initialized to 0. Re-initializing longestSeqLength
  would be wrong. 

* Other if-else logic is possible, but the above is fairly clean. Another approach might be to only
  check curr vs. longest upon reaching a sequence's end, but that introduces complexity (especially since
  the end might be due to an I or due to reaching the last item in the list). The above approach is
  slightly less efficient because the curr vs. longest check is done for every item while in a sequence, 
  but simple and readable code is the first priority. Efficiency usually only need be considered when it is 
  a problem (like on very large data sets).   
  
* Enumerating the possible situations within a loop, and handling each separately, is a common pattern. Here, 
  it doesn't really matter if a sequence is just beginning or if we're in the middle of a sequence; each
  case was handled the same (by incrementing the curr variable, and then possibly updating the longest variable). 
  
*/
