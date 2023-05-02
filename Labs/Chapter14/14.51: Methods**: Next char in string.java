/*Write a method that, given a string, index, and character, returns the index of the first occurrence of the character starting the search at the index. 
If not found, return -1. If the inputs are "Hello-friends", 3, and 'e', the method returns 9 (indexing the 'e' in friends).
Hints:
    Various approaches exist to solve this problem. We prefer an approach that uses a for loop along with a boolean variable to 
    indicate the character was found (which should end the for loop immediately).*/
import java.util.Scanner; 

public class LabProgram {
   public static int findNextCharInString(String s, int startIndex, char c) {
      int i;
      Boolean charFound = false;
      
      for (i = startIndex; (i < s.length()) && !charFound; ++i) {
         if (s.charAt(i) == c) { // Found, stop searching
            charFound = true;
         }
      }
      
      if (charFound) {
         return i - 1;  // -1 because ++i got executed after char was found at index i
      }
      else {
         return -1;
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      String inputString; 
      int startIndex; 
      char searchChar; 
      
      inputString = scnr.next(); 
      startIndex = scnr.nextInt(); 
      searchChar = scnr.next().charAt(0); 
      
      System.out.println(findNextCharInString(inputString, startIndex, searchChar)); 
   }
}


/* NOTES

* The loop must immediately stop iterating, else this will not be correct. Other approaches are possible, like using break 
to exit the loop, or using a variable to store the index (initialized to -1) and letting iteration complete. 

* A while loop is also reasonable. We like to use for loops to iterate through strings or vectors, even if we might
exit early, to be consistent across all our code that iterates through strings or vectors. The code gets a familiar feel.

*/
