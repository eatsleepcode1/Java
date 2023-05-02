/*Users may type or copy-paste in a text box of a web form, perhaps a name like "Joe Smith". The user sometimes has whitespace before or after the text, 
like " Joe Smith ". A program typically strips such leading and trailing whitespace. 
Given a string, create a new string that lacks any leading or trailing spaces. Given " Joe Smith ", the new string should be "Joe Smith". 
Be sure to handle the case of the user entering only whitespace, or entering nothing, which each should yield an empty string "".
Hints:
    Initially, try to find the index of the first non-space character. Set the index to 0, then use a while loop to check each character.
    Your while loop expression should first check that the index is valid for the size of the string.
    The length() function of a string returns an int, so declare your index variable as an int so you can compare without a compiler warning.
    Next, try to find the index of the last non-space character. Use a different index variable. 
    Your while loop expression should first check that it is greater-than-or-equal to 0 to ensure it is valid.
    Once you know the first and last non-space characters, you can use .substring() to copy the range of correct characters to the new string.
    After the first while loop, be sure to check if any non-space character was found (by checking if the index is less than the string's last element). 
    If no non-space character was found, just return.*/
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userText; 
      String cleanedText; 
      // Hint: Add declarations as needed
      int i, j, n;
      
      //Hint: Check the scanner has input before attempting to read it
      
      if(!scnr.hasNext()) return;

      userText = scnr.nextLine();
      
      // Find first non-space character
      i = 0;
      while ((i < userText.length()) && (userText.charAt(i) == ' ')) {
         ++i;
      }
      
      if (i == userText.length()) {
         return; // No non-space characters, just return
      }
         
      // Find last non-space character
      j = userText.length() - 1;
      while ((j >= 0) && (userText.charAt(j) == ' ')) {
         --j; 
      }
         
      // Copy just characters from i to j to new string
      cleanedText = userText.substring(i, j + 1);
               
      System.out.println(cleanedText);

   }
}

/* NOTES

* You should manually trace the situation of an empty string "", or a string with only spaces like "   ", to ensure
  they work (and don't access invalid elements). 
  
* while loops are used because the number of leading and trailing spaces are unknown.
  
* The while expressions importantly will not evaluate the second term of an && if the first term is false. That is
  important, because otherwise they would access invalid elements
  
* Try removing the if statement and see what happens. The program crashes, because i is one past the last valid element. 

*/
