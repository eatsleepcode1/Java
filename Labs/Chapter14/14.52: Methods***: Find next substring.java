/*Write a method that returns the index of the next occurrence of a substring in a string. Inputs are the string, start index, and substring. 
If not found, return -1. Do not use built-in string methods. If the input is "heyhey-friend", 1, "hey", the output is 3 (where the second "hey" starts).
Hints:
    This is fairly difficult. You might start by writing a program that looks for a next single character rather than substring. 
    Once that program is working and tested, then you're ready to look for a substring rather than a character.
    To look for a substring, consider writing a loop to do your own string comparison. Other approaches are possible.
    While you iterate through the string, realize that you can stop if you are near enough to the end that the substring can't possibly fit. 
    So don't iterate all the way to i < string.length(); stop sooner than that.*/
import java.util.Scanner; 

public class LabProgram {
   public static int findNextSubstr(String str, int startIndex, String substr) {
      int i, j;
      int foundAtIndex = -1;
      Boolean substrSame;
      
      // No need to keep searching so near end of str that substr can't fit; hence str.size - substr.size + 1
      for (i = startIndex; (i < str.length() - substr.length() + 1); ++i) {
         
         // Check if substr exists starting at this index
         substrSame = true; // Assume true, until see even one mismatch
         for (j = 0; j < substr.length(); ++j) { // Do a string comparison
            if (str.charAt(i + j) != substr.charAt(j)) {
               substrSame = false;
            }
         }
         
         if (substrSame) { // Found, stop searching
            foundAtIndex = i;
            break;
         }
      }
      
      return foundAtIndex;  // Either -1 if not found, or i if found
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      String inputString; 
      int startIndex; 
      String searchStr; 
      
      inputString = scnr.next(); 
      startIndex = scnr.nextInt(); 
      searchStr = scnr.next(); 
      
      System.out.println(findNextSubstr(inputString, startIndex, searchStr)); 
   }
}

/* NOTES

* Many ways exist to iterate in this problem. This approach uses a variable foundAtIndex initialized to -1, and breaks out
out of the main loop when a match is found. 

* Many ways exist to determine if the substring exists at the current index. We felt it easiest to just write our own 
string comparison. 

* Getting the indices right and loop bounds right requires very careful attention. One must be especially careful 
not to access an invalid index. 

*/
